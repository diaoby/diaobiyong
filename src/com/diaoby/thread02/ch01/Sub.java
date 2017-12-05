package com.diaoby.thread02.ch01;

public class Sub extends Mian {
	synchronized public void operatrISubMethod() {
		try {
			while(i>0) {
				i--;
				System.out.println("sub print i="+i);
				Thread.sleep(100);
				super.operatrIMaimMethod();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
