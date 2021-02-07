package com.diaoby.thread01.ch16;

public class Run {

	public static void main(String[] args) {
		try {
			SynchronizedObject object = new SynchronizedObject();
			MyThread thread = new MyThread(object);
			thread.start();
			Thread.sleep(500);
			thread.stop();
			System.out.println(object.getUsername()+" "+object.getPassword());
		} catch (InterruptedException e) {
			System.out.println("==main==");
			e.printStackTrace();
		}
	}

}
