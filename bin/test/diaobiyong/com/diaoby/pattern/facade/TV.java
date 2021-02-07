package com.diaoby.pattern.facade;

public class TV implements Elec{
	private int isOpen = 0;
	public void on() {
		System.out.println("=======开电视");
		isOpen = 1;
	}
	public void off() {
		System.out.println("=======关电视");
		isOpen = 0;
	}
}
