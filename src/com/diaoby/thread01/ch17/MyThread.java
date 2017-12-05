package com.diaoby.thread01.ch17;

public class MyThread extends Thread {
	public void run() {
		super.run();
		while(true) {
			if(Thread.interrupted()) {
				System.out.println("停止了@");
				return;
			}
			System.out.println("timer=="+System.currentTimeMillis());
		}
	}
}
