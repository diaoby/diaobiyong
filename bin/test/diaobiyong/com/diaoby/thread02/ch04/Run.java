package com.diaoby.thread02.ch04;

public class Run {

	public static void main(String[] args) {
		try {
			DealThread t1 = new DealThread();
			t1.setUserName("a");
			Thread thread1 = new Thread(t1);
			thread1.setName("DIAOBY-001");
			thread1.start();
			Thread.sleep(100);
			t1.setUserName("b");
			Thread thread2 = new Thread(t1);
			thread1.setName("DIAOBY-001");
			thread2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
