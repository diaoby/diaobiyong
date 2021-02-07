package com.diaoby.pattern.proxy.ch01;

public class Admin implements Manager {

	@Override
	public void doSomething() {
		System.out.println("管理员干一些事情");
	}

}
