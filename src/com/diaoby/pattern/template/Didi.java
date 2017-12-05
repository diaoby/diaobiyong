package com.diaoby.pattern.template;

public class Didi extends DrivingTemplate {

	@Override
	void getdrivingCompany() {
		System.out.println("滴滴代驾为您服务");

	}

	@Override
	void getdrivingUser() {
		System.out.println("滴滴代驾工号001开始接单");

	}

	@Override
	int getMoney() {
		return 100;
	}
	
	//钩子函数，默认不打折
	protected double discount() {
		return 0.5;
	}

}
