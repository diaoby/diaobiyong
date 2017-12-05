package com.diaoby.pattern.factory.abstractfactory;

import com.diaoby.pattern.factory.abstractfactory.INoodles;

/**
 * 泡面
 * @author Administrator
 *
 */
public class BBNoodles extends INoodles {

	@Override
	public void desc() {
		System.out.println("泡面");
	}

}
