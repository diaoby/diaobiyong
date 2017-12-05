package com.diaoby.thread04.ch01;

public class ThreadA extends Thread{
	
	private MyService myService;
	public ThreadA(MyService myService) {
		super();
		this.myService = myService;
	}
	public void run() {
		myService.await();
	}
}
