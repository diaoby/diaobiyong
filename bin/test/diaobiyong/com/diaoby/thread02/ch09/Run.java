package com.diaoby.thread02.ch09;

public class Run {
	public static void main(String[] args) {
		PrintString p = new PrintString();
		new Thread(p).start();
		System.out.println("我要停止它！"+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
			p.setContinuePring(false);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
