package com.diaoby.thread02.ch12;

public class Run {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		for(int i =0;i<10;i++) {
			Thread t = new Thread(myThread);
			t.start();
		}

	}

}
