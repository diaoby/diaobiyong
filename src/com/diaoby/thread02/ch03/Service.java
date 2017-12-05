package com.diaoby.thread02.ch03;

public class Service {
	private String anyString = new String();
	public void a() {
		try {
			synchronized(anyString) {
				System.out.println("a begin");
				Thread.sleep(2000);
				System.out.println("a end");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void b() {
		System.out.println("b begin");
		System.out.println("b end");
	}
}
