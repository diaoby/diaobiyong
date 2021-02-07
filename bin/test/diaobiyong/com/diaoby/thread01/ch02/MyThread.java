package com.diaoby.thread01.ch02;

public class MyThread extends Thread{
	private int count = 5;
	
	
//	public MyThread(String threadName) {
//		super();
//		this.setName(threadName);
//	}

	@Override
	public synchronized void run() {
		super.run();
//		while(count > 0) {
			count--;
			System.out.println("count:"+count+"===="+Thread.currentThread().getName());
//		}
		
	}
	
}
