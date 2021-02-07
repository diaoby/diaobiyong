package com.diaoby.pattern.factory.simplefactory;

import com.diaoby.pattern.factory.simplefactory.BBNoodles;
import com.diaoby.pattern.factory.simplefactory.LzNoodles;
import com.diaoby.pattern.factory.simplefactory.PaoNoodles;

/**
 * 简单工厂
 * @author Administrator
 *
 */
public class SimpleNoodlesFactory {
	public static final int TYPE_LZ = 1;
	public static final int TYPE_PM = 2;
	public static final int TYPE_BB = 3;
	
	public static INoodles createNoodles(int type) {
		switch(type) {
			case TYPE_LZ:
				return new LzNoodles();
			case TYPE_PM :
				return new PaoNoodles();
			case TYPE_BB :
				return new BBNoodles();
			default:
				return new LzNoodles();
		}
	}
	
}
