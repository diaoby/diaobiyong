package com.diaoby.thread05.ch01;

public class MyThread extends Thread{
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
