package com.diaoby.thread03.ch01;

public class C {
	private String lock;
	public C(String lock) {
		super();
		this.lock = lock;
	}
	public void getValue() {
		try {
			synchronized(lock) {
				while(ValueObject.value.equals("")) {
					System.out.println("消费者"+Thread.currentThread().getName()+" WAITING 了");
					lock.wait();
				}
				System.out.println("消费者"+Thread.currentThread().getName()+" RUNNABLE 了");
//				System.out.println("消费者 "+ValueObject.value);
				ValueObject.value = "";
				lock.notify();
			} 
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
