package com.diaoby.pattern.singleton;


/**
 * 单例模式--使用枚举类型实现
 * 枚举enum和静态代码块的特性相似，在使用枚举时，构造方法会被自动调用
 * @author Administrator
 * 在内存中只有一个对象，节省内存空间。
 */
public enum EnumFactory {
	
	singletonFactory;
	
	private Sinleton8 singleton;
	
	private EnumFactory() {//枚举类的构造方法在类加载是被实例化 
		singleton = new Sinleton8();
	}
	
	
	public Sinleton8 getInstance() {
		return singleton;
	}
}

class Sinleton8 {
	public Sinleton8() {}
}
