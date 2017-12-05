package com.diaoby.thread02.ch03;

public class MyThreadA extends Thread {	

	private MyOneList list;
	
	public MyThreadA(MyOneList list) {
		super();
		this.list = list;
	}
	
	public void run() {
		MyService myService = new MyService();
		myService.addServiceMethod(list, "A");
	}
}
