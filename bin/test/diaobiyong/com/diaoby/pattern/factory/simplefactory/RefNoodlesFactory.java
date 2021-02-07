package com.diaoby.pattern.factory.simplefactory;
/**
 * 通过反射实现简单工厂
 * @author Administrator
 *
 */
public class RefNoodlesFactory {
	public static <T extends INoodles >T createNoodles(Class<T> clz) {
		T result = null;
		try {
			result = (T) Class.forName(clz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
}
