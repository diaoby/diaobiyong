package com.diaoby.thread02.ch12;

import java.util.Random;

public class MyThread extends Thread{
	 public void run() {
		try {
			Random random = new Random();
			int i =  random.nextInt(10);
			Thread.sleep(i*1000);
			System.out.println(System.nanoTime());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
