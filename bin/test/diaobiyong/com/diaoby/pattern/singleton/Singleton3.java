package com.diaoby.pattern.singleton;
/**
 * 单例模式--懒汉模式-调用时才实例化--双重检查
 * @author Administrator
 * 在内存中只有一个对象，节省内存空间。
 */
public class Singleton3 {
	//指向自己实例的私有静态引用
	volatile private static Singleton3 singleton;
	//私有的构造方法
	private Singleton3() {};
	//以自己实例为返回值的静态的公有的方法---必须加同步，不然多线程可能new 出多个线程
	//性能比 Singleton2 高
	public static Singleton3 getInstance() {
		if(null==singleton) {
			try {
				Thread.sleep(2000);
				synchronized(Singleton3.class) {
					if(null==singleton) {
						singleton = new Singleton3();
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return singleton;
	}
}
