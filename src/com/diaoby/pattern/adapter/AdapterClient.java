package com.diaoby.pattern.adapter;

public class AdapterClient {

	public static void main(String[] args) {
		//老的调用
		Target target = new TargetImpl();
		target.targetMethod();
		//后来感觉不能满足了，----我要出国了，需要插110V的插头了
		System.out.println("==========================类适配后===========");
		target = new Adapter();//只改了实现类
		target.targetMethod();
		System.out.println("==========================对象适配后===========");
		target = new Adapter2();
		target.targetMethod();
		System.out.println("==========================end11===========");
	}

}
