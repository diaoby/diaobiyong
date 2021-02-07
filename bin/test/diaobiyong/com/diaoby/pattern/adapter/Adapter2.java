package com.diaoby.pattern.adapter;
/**
 * 对象适配
 * @author Administrator
 *
 */
public class Adapter2 implements Target {
	private Adaptee adaptee = new Adaptee();

	@Override
	public void targetMethod() {
		System.out.println("我能适配了");
		adaptee.doSomething();
	}

}
