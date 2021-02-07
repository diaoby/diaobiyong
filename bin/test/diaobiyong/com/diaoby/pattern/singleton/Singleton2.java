package com.diaoby.pattern.singleton;
/**
 * 单例模式--懒汉模式-调用时才实例化
 * @author Administrator
 * 在内存中只有一个对象，节省内存空间。
 */
public class Singleton2 {
	//指向自己实例的私有静态引用
	private static Singleton2 singleton;
	//私有的构造方法
	private Singleton2() {};
	//以自己实例为返回值的静态的公有的方法---必须加同步，不然多线程可能new 出多个线程
	//性能低
	public static synchronized Singleton2 getInstance() {
		if(null==singleton) {
			try {
				Thread.sleep(2000);
				singleton = new Singleton2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return singleton;
	}
}
