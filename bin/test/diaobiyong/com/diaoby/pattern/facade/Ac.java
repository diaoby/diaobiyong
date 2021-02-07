package com.diaoby.pattern.facade;

public class Ac implements Elec{
	private int isOpen = 0;
	public void on() {
		System.out.println("=======开空调");
		isOpen = 1;
	}
	public void off() {
		System.out.println("=======关空调");
		isOpen = 0;
	}
}
