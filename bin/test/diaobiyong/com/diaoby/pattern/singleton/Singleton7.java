package com.diaoby.pattern.singleton;


/**
 * 单例模式--使用stiatc 代码块实现
 * @author Administrator
 * 在内存中只有一个对象，节省内存空间。
 */
public class Singleton7 {
	
	private static Singleton7 singleton = null;
	
	private Singleton7() {}
	
	static {
		singleton = new Singleton7();
	}
	
	public static Singleton7 getInstance() {
		return singleton;
	}
}
