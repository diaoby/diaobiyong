package com.diaoby.thread02.ch01;

public class Run {
	public static void main(String [] args) {
		MyThread t = new MyThread();
		t.start();
		MyThread t2 = new MyThread();
		t2.start();
	}
}
