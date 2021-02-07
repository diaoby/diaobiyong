package com.diaoby.pattern.adapter;
/**
 * 类适配
 * @author Administrator
 *
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void targetMethod() {
		System.out.println("我能适配了");
		super.doSomething();
	}

}
