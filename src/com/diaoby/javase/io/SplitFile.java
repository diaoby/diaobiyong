package com.diaoby.javase.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SplitFile {
	//文件路径
	private String filePath;
	//每块大小
	private long blockSize;
	//块数
	private int size;
	//每块名称
	private List<String> blockPath;
	//文件名
	private String fileName;
	//文件大小
	private long length;
	//默认块大小
	private final static long DEFALUT_BLOCK_SIZE = 1024;
	
	
	/**
	 * 
	 * @param filePath
	 */
	public SplitFile() {
		blockPath = new ArrayList<String>();
	}
	
	/**
	 * 
	 * @param filePath
	 */
	public SplitFile(String filePath) {
		this(filePath,DEFALUT_BLOCK_SIZE);
	}
	
	public SplitFile(String filePath,long blockSize) {
		this();
		this.filePath = filePath;
		this.blockSize = blockSize;
		init();
	}
	/**
	 *  初始化操作，计算块数 确定文件名
	 */
	public void init() {
		File src = null;
		if(null==filePath||!((src=new File(filePath)).exists())) {
			return;
		}
		if(src.isDirectory()) {
			return;
		}
		this.fileName = src.getName();
		this.length = src.length();
		//计算快数
		long length = src.length();
		if(this.blockSize>length) {
			this.blockSize = length;
		}
		//块数
		size = (int)Math.ceil(length*1.0/this.blockSize);
	}
	/**
	 * 初始化名称
	 */
	private void initPathName(String destPath) {
		for (int i = 0; i < size ; i++) {
			blockPath.add(destPath+"/"+this.fileName+".part"+i);
		}
	}
	/**
	 * 文件分隔
	 * 第几块
	 * 起始位置
	 * 实际大小
	 * @param destPath
	 */
	public void split(String destPath) {
		initPathName(destPath);
		long beginPos = 0;
		long actualBlockSize = this.blockSize;
		for (int i = 0; i < size; i++) {
			if(i == size-1) {//最后一块大小
				actualBlockSize = this.length - beginPos;
			}
			splitDetail(i,beginPos,actualBlockSize);
			beginPos+=actualBlockSize;
		}
	}
	/**
	 * 文件分隔
	 * 文件的拷贝
	 * @param idx
	 * @param beginPos
	 * @param actualBlockSize
	 */
	private void splitDetail(int idx,long beginPos,long actualBlockSize) {
		//创建源
		File src = new File(this.filePath);
		File dest = new File(this.blockPath.get(idx));
		RandomAccessFile raf = null;
		BufferedOutputStream bos = null;
		try {
			raf = new RandomAccessFile(src,"r");//输入流
			bos = new BufferedOutputStream(new FileOutputStream(dest));//输出流
			
			//读取文件
			raf.seek(beginPos);
			//缓冲区
			byte[] flush = new byte[1024];
			int length = 0;
			while(-1!=(length = raf.read(flush))) {
				//写出
				if(actualBlockSize-length>=0) {
					bos.write(flush, 0, length);
					actualBlockSize-=length;
				}else {
					bos.write(flush, 0, (int)actualBlockSize);
					break;
				}
				bos.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeIo(bos,raf);
		}
		
	}
	/**
	 * 
	 * @param destPath
	 */
	private void mergeFile(String destPath) {
		File dest= new File(destPath);
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream(dest,true));
			File src = null;
			//分块文件
			for(String filePath:this.blockPath) {
				src = new File(filePath);
				bis = new BufferedInputStream(new FileInputStream(src));
				byte[] flush = new byte[1024];
				int len = 0;
				while(-1!=(len=bis.read(flush))) {
					bos.write(flush, 0, len);
				}
				bos.flush();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeIo(bos,bis);
		}
	}
	/**
	 * 关闭流
	 */
	private void closeIo(Closeable... closes) {
		for (Closeable io :closes) {
			try {
				if(null!=io) {
					io.close();
					io = null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SplitFile  splitFile = new SplitFile("E:\\diaoby\\test.txt",250);
		splitFile.split("E:\\diaoby\\");
		splitFile.mergeFile("E:\\diaoby\\mergetest.txt");
	}
}
