package com.diaoby.thread02.ch02;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		MyThreadA a = new MyThreadA(service);
		a.setName("A");
		a.start();
		MyThreadB b = new MyThreadB(service);
		b.setName("B");
		b.start();
	}

}
