package com.diaoby.thread01.ch14;

public class MyThread extends Thread {
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("进入InterruptedException 类"+this.isInterrupted());
			e.printStackTrace();
		}
	}
}
