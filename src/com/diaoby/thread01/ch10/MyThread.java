package com.diaoby.thread01.ch10;

public class MyThread extends Thread {
	public void run() {
		super.run();
		for(int i =0;i<500000;i++) {
			System.out.println(i+1);
		}
	}
}
