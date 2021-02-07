package com.diaoby.thread02.ch02;

public class MyThreadB extends Thread {	

	private Service service;
	
	public MyThreadB(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.b();
	}
}
