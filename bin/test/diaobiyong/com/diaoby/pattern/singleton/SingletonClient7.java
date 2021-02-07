package com.diaoby.pattern.singleton;

public class SingletonClient7 extends Thread{
	@Override
	public void run() {
		System.out.println(Singleton7.getInstance().hashCode());
	}
	
	
	public static void main(String[] args) {
		SingletonClient7[] scs = new SingletonClient7[3];
		for(int i =0;i<scs.length;i++) {
			scs[i] = new SingletonClient7();
		}
		for(int i =0;i<scs.length;i++) {
			scs[i].start();
		}
	}

}
