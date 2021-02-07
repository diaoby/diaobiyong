package com.diaoby.pattern.singleton;

public class SingletonClient9 extends Thread{
	@Override
	public void run() {
		System.out.println(ClassFactory.getInstance().hashCode());
	}
	
	
	public static void main(String[] args) {
		SingletonClient9[] scs = new SingletonClient9[3];
		for(int i =0;i<scs.length;i++) {
			scs[i] = new SingletonClient9();
		}
		for(int i =0;i<scs.length;i++) {
			scs[i].start();
		}
	}

}
