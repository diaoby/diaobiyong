package com.diaoby.pattern.proxy.ch02;


public class Admin implements Manager {

	@Override
	public void doSomething() {
		System.out.println("管理员干一些事情");
	}

}
