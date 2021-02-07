package com.diaoby.pattern.facade;

public class ElecFacade {
	static Elec ac = new Ac();
	static Elec ligth = new Ligth();
	static Elec tv = new TV();
	
	public static void on() {
		ligth.on();
		tv.on();
		ac.on();
	}
	
	public static void off() {
		ligth.off();
		tv.off();
		ac.off();
	}
}
