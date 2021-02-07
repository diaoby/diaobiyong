package com.diaoby.thread02.ch11;

public class Run {
	public static void main(String[] args) {
		AddCountThread[] myThreadArray = new AddCountThread[100];
		for(int i=0;i<5;i++) {
			myThreadArray[i] = new AddCountThread();
		}
		for(int i=0;i<5;i++) {
			myThreadArray[i].start();
		}
	}
}
