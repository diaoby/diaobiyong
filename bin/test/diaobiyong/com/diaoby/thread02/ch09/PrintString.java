package com.diaoby.thread02.ch09;

public class PrintString implements Runnable {
	private boolean isContinuePring = true;

	public void setContinuePring(boolean isContinuePring) {
		this.isContinuePring = isContinuePring;
	}
	
	public void printStringMethod() {
		while(isContinuePring == true) {
			try {
				System.out.println("run printStringMehtod threadName ="+
						Thread.currentThread().getName());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		printStringMethod();
	}

}
