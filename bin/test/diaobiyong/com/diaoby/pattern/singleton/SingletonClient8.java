package com.diaoby.pattern.singleton;

public class SingletonClient8 extends Thread{
	@Override
	public void run() {
		System.out.println(EnumFactory.singletonFactory.getInstance().hashCode());
	}
	
	
	public static void main(String[] args) {
		SingletonClient8[] scs = new SingletonClient8[3];
		for(int i =0;i<scs.length;i++) {
			scs[i] = new SingletonClient8();
		}
		for(int i =0;i<scs.length;i++) {
			scs[i].start();
		}
	}

}
