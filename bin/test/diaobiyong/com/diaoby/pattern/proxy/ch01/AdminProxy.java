package com.diaoby.pattern.proxy.ch01;

public class AdminProxy implements Manager {
	private Admin admin;
	
	public AdminProxy(Admin admin) {
		super();
		this.admin = admin;
	}

	@Override
	public void doSomething() {
		System.out.println("代理管理员操作开始");
		admin.doSomething();
		System.out.println("代理管理员操作结束");
	}

}
