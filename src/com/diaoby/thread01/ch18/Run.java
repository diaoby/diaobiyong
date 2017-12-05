package com.diaoby.thread01.ch18;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final SynchronizedObject object = new SynchronizedObject();
		Thread thread1 = new Thread() {
			public void run() {
				object.pringString();
			}
		};
		thread1.setName("a");
		thread1.start();
		Thread.sleep(1000);
		
		Thread thread2 = new Thread() {
			public void run() {
				System.out.println("thread 2 启动了,但是进入不到pringString FANGFA @只打印一个begin方法");
				System.out.println("因为pringString 被线程a 暂停了");
				object.pringString();
			}
		};
		thread2.start();
	}

}
