package com.diaoby.thread03.ch02;

public class PThread extends Thread{
	private P p;
	public PThread(P p) {
		super();
		this.p = p;
	}
	public void run() {
		while(true) {
			p.push();
		}
	}
}
