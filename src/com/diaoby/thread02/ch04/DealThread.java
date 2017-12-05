package com.diaoby.thread02.ch04;

public class DealThread implements Runnable {
	public String userName;
	public Object obj1 = new Object();
	public Object obj2 = new Object();
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public void run() {
		if(userName.equals("a")) {
			synchronized (obj1) {
				try {
					System.out.println("userName="+userName);
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (obj2) {
					System.out.println("按obj1---obj2 代码顺序执行");
				}
			}
		}
		
		if(userName.equals("b")) {
			synchronized (obj2) {
				try {
					System.out.println("userName="+userName);
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (obj1) {
					System.out.println("按obj2---obj1 代码顺序执行");
				}
			}
		}

	}

}
