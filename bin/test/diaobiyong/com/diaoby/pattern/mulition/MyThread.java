package com.diaoby.pattern.mulition;

public class MyThread extends Thread {
	private MulitionInstance mulit;
	public MyThread(MulitionInstance mulit) {
		super();
		this.mulit = mulit;
	}
	public void run() {
		mulit.desc();
	}
}
