package com.diaoby.thread03.ch03;

public class Run {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		P p = new P(myStack);
		C c1 = new C(myStack);
		C c2 = new C(myStack);
		C c3 = new C(myStack);
		PThread pThread = new PThread(p);
		pThread.setName("生产者");
		CThread cThread1 = new CThread(c1);
		cThread1.setName("消费者1");
		CThread cThread2 = new CThread(c2);
		cThread2.setName("消费者2");
		CThread cThread3 = new CThread(c3);
		cThread3.setName("消费者3");
		pThread.start();
		cThread1.start();
		cThread2.start();
		cThread3.start();
	}

}
