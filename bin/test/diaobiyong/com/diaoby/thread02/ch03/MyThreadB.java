package com.diaoby.thread02.ch03;

public class MyThreadB extends Thread {	

	private MyOneList list;
	
	public MyThreadB(MyOneList list) {
		super();
		this.list = list;
	}
	
	public void run() {
		MyService myService = new MyService();
		myService.addServiceMethod(list, "B");
	}
}
