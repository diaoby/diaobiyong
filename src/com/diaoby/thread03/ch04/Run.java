package com.diaoby.thread03.ch04;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
	public static void main(String[] args) throws InterruptedException, IOException {
		WriteData writeData = new WriteData();
		ReadData readData = new ReadData();
		PipedInputStream input = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		
		out.connect(input);
		
		ThreadWrite threadWrite = new ThreadWrite(writeData,out);
		ThreadRead threadRead = new ThreadRead(readData,input);
		threadRead.start();
		Thread.sleep(2000);
		threadWrite.start();
	}
}
