package com.diaoby.thread02.ch02;

public class MyThreadA extends Thread {	

	private Service service;
	
	public MyThreadA(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.a();
	}
}
