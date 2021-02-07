package com.diaoby.thread01.ch01;

public class Test {

	public static void main(String[] args) {
		MyThread myThreadA  = new MyThread("A");
		MyThread myThreadB  = new MyThread("B");
		MyThread myThreadC  = new MyThread("C");
		myThreadA.start();
		myThreadB.start();
		myThreadC.start();
	}

}
