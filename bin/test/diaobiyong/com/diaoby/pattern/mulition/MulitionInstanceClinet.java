package com.diaoby.pattern.mulition;

public class MulitionInstanceClinet {

	public static void main(String[] args) {
		for(int i=0; i<6; i++){
			MulitionInstance mulit = MulitionInstance.getRandomInstance();
		    mulit.desc();
		}
		System.out.println("==========华丽的分隔线============");
		MulitionInstance dmulit  = MulitionInstance.getInstance("大老婆");
		dmulit.desc();
		MulitionInstance xmulit  = MulitionInstance.getInstance("小老婆");
		dmulit.desc();
		dmulit  = MulitionInstance.getInstance("大老婆");
		dmulit.desc();
		xmulit  = MulitionInstance.getInstance("小老婆");
		dmulit.desc();
		System.out.println("==========华丽的分隔线============");
		MyThread[] ts = new MyThread[5];
		for(int i = 0;i<5;i++) {
			ts[i] = new MyThread(MulitionInstance.getRandomInstance());
		}
		for(int i = 0;i<5;i++) {
			ts[i].start();
		}
	}

}
