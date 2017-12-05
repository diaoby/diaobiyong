package com.diaoby.pattern.adapter;

public class TargetImpl implements Target {

	@Override
	public void targetMethod() {
		System.out.println("======老的实现只能做某事：比如只能查220V的插头======");
	}

}
