package com.diaoby.thread01.ch13;

public class MyThread extends Thread {
	public void run() {
		super.run();
		try {
			for(int i=0;i<500000;i++) {
				if(this.interrupted()) {
					System.out.println("============我已经停止了，退出");
					throw new InterruptedException();
				}
				System.out.println(i);
			}
			System.out.println("============我呗输出了，如果此代码是for循环，又继续运行，线程并未停止");
		} catch (InterruptedException e) {
			System.out.println("进入InterruptedException 类");
			e.printStackTrace();
		}
	}
}
