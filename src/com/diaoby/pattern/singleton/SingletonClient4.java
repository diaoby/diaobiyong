package com.diaoby.pattern.singleton;

public class SingletonClient4 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Singleton4 singleton = Singleton4.getInstance();
				System.out.println(singleton.hashCode());
			}
		});
		t1.start();
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Singleton4 singleton = Singleton4.getInstance();
				System.out.println(singleton.hashCode());
			}
		});
		t2.start();
	}

}
