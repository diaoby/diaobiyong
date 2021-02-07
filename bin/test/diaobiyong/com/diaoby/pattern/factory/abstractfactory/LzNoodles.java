package com.diaoby.pattern.factory.abstractfactory;

import com.diaoby.pattern.factory.abstractfactory.INoodles;

/**
 * 兰州拉面
 * @author Administrator
 *
 */
public class LzNoodles extends INoodles {

	@Override
	public void desc() {
		System.out.println("兰州拉面");
	}

}
