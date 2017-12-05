package com.diaoby.thread01.ch15;

public class MyThread extends Thread {
	public void run() {
		super.run();
		try {
			for(int i =0;i<100000;i++) {
				System.out.println(i);
			}
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("先停止再遇到了sleep进入catch");
			e.printStackTrace();
		}
	}
}
