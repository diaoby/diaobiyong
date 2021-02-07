package com.diaoby.pattern.proxy.ch02;

import java.lang.reflect.Proxy;

public class JDKProxyClient {

	public static void main(String[] args) throws Exception {
		Manager admin = new Admin();
		AdminHandler h = new AdminHandler(admin);
		Class<?> cls = admin.getClass();
		Manager adminProxy = (Manager) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		adminProxy.doSomething();
	}

}
