package com.diaoby.thread01.ch08;

public class MyThread1 extends Thread {
	public void run(){
		try {
			System.out.println("begin run this threadName="+this.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("end run this threadName="+this.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
