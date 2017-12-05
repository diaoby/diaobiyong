package com.diaoby.thread03.ch02;

public class Run {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		P p = new P(myStack);
		C c = new C(myStack);
		PThread pThread = new PThread(p);
		pThread.setName("生产者");
		CThread cThread = new CThread(c);
		cThread.setName("消费者1");
		pThread.start();
		cThread.start();
	}

}
