package com.diaoby.pattern.facade;
/**
 * 灯
 * @author Administrator
 *
 */
public class Ligth implements Elec{
	private int isOpen = 0;
	public void on() {
		System.out.println("=======开灯");
		isOpen = 1;
	}
	public void off() {
		System.out.println("=======关灯");
		isOpen = 0;
	}
}
