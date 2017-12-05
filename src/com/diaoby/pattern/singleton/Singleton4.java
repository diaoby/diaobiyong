package com.diaoby.pattern.singleton;
/**
 * 单例模式--静态内置类实现
 * @author Administrator
 * 在内存中只有一个对象，节省内存空间。
 */
public class Singleton4 {
	private static class Singleton4Handler{
		private static Singleton4 singleton = new Singleton4();
	}
	private Singleton4() {}
	public static Singleton4 getInstance() {
		return Singleton4Handler.singleton;
	}
}
