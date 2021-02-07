package com.diaoby.thread01.ch18;

public class SynchronizedObject {
	synchronized public void pringString() {
		System.out.println("begin");
		if(Thread.currentThread().getName().equals("a")) {
			System.out.println("a 线程永远 suspend@");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
