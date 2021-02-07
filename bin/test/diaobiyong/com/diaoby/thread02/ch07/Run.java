package com.diaoby.thread02.ch07;

import com.diaoby.thread02.ch07.OutClass.Inner;

public class Run {

	public static void main(String[] args) {
		final Inner inner = new Inner();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				inner.method1();
			} 
		}); 
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				inner.method2();
			} 
		}); 
		 t1.start();
		 t2.start();
	}

}
