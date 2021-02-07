package com.diaoby.pattern.strategy;

public class Car implements IStrategy {

	@Override
	public void operate() {
		System.out.println("开车去");
	}

}
