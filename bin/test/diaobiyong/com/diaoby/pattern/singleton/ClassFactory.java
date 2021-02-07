package com.diaoby.pattern.singleton;

/**
 * 单例模式--使用枚举类型实现--不暴露枚举实现的封装代码
 * 枚举enum和静态代码块的特性相似，在使用枚举时，构造方法会被自动调用
 * @author Administrator
 * 在内存中只有一个对象，节省内存空间。
 */
public class ClassFactory {
	
	private enum MyEnumSingleton{
		singletonFactory;
		
		private Sinleton9 singleton;
		
		private MyEnumSingleton() {//枚举类的构造方法在类加载是被实例化 
			singleton = new Sinleton9();
		}
		public Sinleton9 getInstance() {
			return singleton;
		}
	}
	
	public static Sinleton9 getInstance() {
		return MyEnumSingleton.singletonFactory.getInstance();
	}
}
class Sinleton9 {
	public Sinleton9() {}
}
