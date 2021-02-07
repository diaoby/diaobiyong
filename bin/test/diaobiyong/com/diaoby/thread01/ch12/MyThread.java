package com.diaoby.thread01.ch12;

public class MyThread extends Thread {
	public void run() {
		super.run();
		for(int i=0;i<500000;i++) {
			if(this.interrupted()) {
				System.out.println("============我已经停止了，退出");
				break;
			}
			System.out.println(i);
		}
		System.out.println("============我呗输出了，如果此代码是for循环，又继续运行，线程并未停止");
	}
}
