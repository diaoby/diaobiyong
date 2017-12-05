package com.diaoby.thread03.ch01;

public class ThreadC extends Thread{
	private C c;
	public ThreadC(C c) {
		super();
		this.c = c;
	}

	public void run() {
		while(true) {
			c.getValue();
		}
	}
}
