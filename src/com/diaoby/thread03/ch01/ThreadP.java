package com.diaoby.thread03.ch01;

public class ThreadP extends Thread{
	private P p;
	public ThreadP(P p) {
		super();
		this.p = p;
	}

	public void run() {
		while(true) {
			p.setValue();
		}
	}
}
