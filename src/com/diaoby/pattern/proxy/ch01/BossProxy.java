package com.diaoby.pattern.proxy.ch01;

public class BossProxy implements Manager {
	private Admin admin;
	
	public BossProxy(Admin admin) {
		super();
		this.admin = admin;
	}

	
	@Override
	public void doSomething() {
		System.out.println("BOSS亲自来代理操作开始");
		admin.doSomething();
		System.out.println("BOSS亲自来代理操作结束");

	}

}
