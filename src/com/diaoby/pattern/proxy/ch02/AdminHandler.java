package com.diaoby.pattern.proxy.ch02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class AdminHandler implements InvocationHandler {
	private Object target;
	public AdminHandler(Object target) {
		super();
		this.target  = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("管理员开始工作");
		method.invoke(target, args);
		System.out.println("管理员开始结束");
		long endTime = System.currentTimeMillis();
		System.out.println("管理员工作时间:"+(endTime-startTime));
		return null;
	}



}
