package com.diaoby.thread01.ch06;

public class MyThread extends Thread{
	public void run() {
		System.out.println("============run="+this.getName()+"=="+this.isAlive());
		System.out.println("============run="+Thread.currentThread().getName()+"=="+Thread.currentThread().isAlive());
	}
}
