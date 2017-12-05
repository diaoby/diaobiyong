package com.diaoby.pattern.singleton;

import java.io.Serializable;

/**
 * 单例模式--序列化 和反序列化后对象不一样
 * @author Administrator
 * 在内存中只有一个对象，节省内存空间。
 */
public class Singleton5 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static class Singleton4Handler{
		private static Singleton5 singleton = new Singleton5();
	}
	private Singleton5() {}
	public static Singleton5 getInstance() {
		return Singleton4Handler.singleton;
	}
}
