package com.diaoby.thread04.ch01;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService myService = new MyService();
		ThreadA threadA = new ThreadA(myService);
		threadA.start();
		Thread.sleep(3000);
		myService.singal();
	}

}
