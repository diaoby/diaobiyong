package com.diaoby.thread01.ch05;

public class Run {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread thread = new Thread(c);
//		c.setName("A");
		thread.start();
	}

}
