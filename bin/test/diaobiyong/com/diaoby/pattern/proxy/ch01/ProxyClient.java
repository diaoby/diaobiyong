package com.diaoby.pattern.proxy.ch01;

public class ProxyClient {

	public static void main(String[] args) {
		//直接找管理员干
		Manager admin = new Admin();
		admin.doSomething();
		//找管理员代理干
		admin = new AdminProxy(new Admin());
		admin.doSomething();
		
		//找BOSS来代理干
		admin = new BossProxy(new Admin());
		admin.doSomething();
	}

}
