package com.diaoby.thread03.ch02;

public class CThread extends Thread{
	private C c;
	public CThread(C c) {
		super();
		this.c = c;
	}
	public void run() {
		while(true) {
			c.pop();
		}
	}
}
