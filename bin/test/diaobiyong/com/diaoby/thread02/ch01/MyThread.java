package com.diaoby.thread02.ch01;

public class MyThread extends Thread{
	public void run() {
		Sub sub = new Sub();
		sub.operatrISubMethod();
	}
}
