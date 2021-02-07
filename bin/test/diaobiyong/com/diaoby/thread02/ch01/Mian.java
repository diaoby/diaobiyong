package com.diaoby.thread02.ch01;

public class Mian {
	public int i =10;
	synchronized public void operatrIMaimMethod() {
		try {
			i--;
			System.out.println("main print i="+i);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
