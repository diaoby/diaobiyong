package com.diaoby.pattern.singleton;
/**
 * 单例模式-就饿汉模式 类加载时就实例化
 * @author Administrator
 * 在内存中只有一个对象，节省内存空间。
 */
public class Singleton {
	//指向自己实例的私有静态引用
	private static Singleton singleton = new Singleton();
	//私有的构造方法
	private Singleton() {};
	//以自己实例为返回值的静态的公有的方法
	public static Singleton getInstance() {
		return singleton;
	}
}
