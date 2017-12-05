package com.diaoby.thread01.ch16;

public class MyThread extends Thread {
	private SynchronizedObject object;
	public MyThread(SynchronizedObject object) {
		super();
		this.object = object;
	}
	
	public void run() {
		super.run();
		object.pringString("b", "bb");
	}
}
