package com.diaoby.pattern.factory.simplefactory;

import com.diaoby.pattern.factory.simplefactory.BBNoodles;
import com.diaoby.pattern.factory.simplefactory.LzNoodles;
import com.diaoby.pattern.factory.simplefactory.PaoNoodles;

public class MulWayNoodlesFactory {
	/**
	 * 模仿Executors 类
	 * @return
	 */
	public static INoodles createPm() {
		return new PaoNoodles();
	}
	/**
	 * 模仿Executors 类
	 * @return
	 */
	public static INoodles createBB() {
		return new BBNoodles();
	}
	/**
	 * 模仿Executors 类
	 * @return
	 */
	public static INoodles createLz() {
		return new LzNoodles();
	}
}
