package com.diaoby.thread01.ch10;

public class Run2 {

	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.start();
			Thread.sleep(1000);
			myThread.interrupt();
			System.out.println("是否停止1？"+Thread.interrupted());
			System.out.println("是否停止2？"+Thread.interrupted());
			Thread.currentThread().interrupt();
			System.out.println("是否停止1？"+Thread.interrupted());
			System.out.println("是否停止2？"+Thread.interrupted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
