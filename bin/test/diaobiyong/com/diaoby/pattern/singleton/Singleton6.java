package com.diaoby.pattern.singleton;

import java.io.Serializable;

/**
 * 单例模式--序列化 和反序列化后对象不一样---解决方案 readResolve
 * @author Administrator
 * 在内存中只有一个对象，节省内存空间。
 */
public class Singleton6 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static class Singleton4Handler{
		private static Singleton6 singleton = new Singleton6();
	}
	private Singleton6() {}
	public static Singleton6 getInstance() {
		return Singleton4Handler.singleton;
	}
	
	//该方法在反序列化时会被调用，该方法不是接口定义的方法，有点儿约定俗成的感觉 
	protected Object readResolve() {
		System.out.println("===========反序列化的时候被调用了===========");
		return Singleton4Handler.singleton;
	}
}
