package com.diaoby.pattern.strategy;

public class Bus implements IStrategy {

	@Override
	public void operate() {
		System.out.println("坐公交去");
	}

}
