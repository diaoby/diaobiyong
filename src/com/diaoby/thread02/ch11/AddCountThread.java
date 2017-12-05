package com.diaoby.thread02.ch11;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread{
	private AtomicInteger count = new AtomicInteger(0);
	
	private void addCount() {
		for(int i=0;i<10;i++) {
			System.out.println(" Thread ="+Thread.currentThread().getName()+" count="+count.incrementAndGet());
		}
	}
	
	public void run() {
		addCount();
	}
}
