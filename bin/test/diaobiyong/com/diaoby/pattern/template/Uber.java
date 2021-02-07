package com.diaoby.pattern.template;

public class Uber extends DrivingTemplate {

	@Override
	void getdrivingCompany() {
		System.out.println("Uber代驾为您服务");

	}

	@Override
	void getdrivingUser() {
		System.out.println("Uber工号10086为您服务");

	}

	@Override
	int getMoney() {
		return 60;
	}

}
