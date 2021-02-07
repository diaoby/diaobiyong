package com.diaoby.thread02.ch03;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyOneList list = new MyOneList();
		MyThreadA a = new MyThreadA(list);
		a.setName("A");
		a.start();
		MyThreadB b = new MyThreadB(list);
		b.setName("B");
		b.start();
		Thread.sleep(6000);
		System.out.println("list size="+list.getSize());
	}

}
