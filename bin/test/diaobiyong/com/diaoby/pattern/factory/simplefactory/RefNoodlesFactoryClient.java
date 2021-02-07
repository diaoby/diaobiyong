package com.diaoby.pattern.factory.simplefactory;

import com.diaoby.pattern.factory.simplefactory.LzNoodles;

public class RefNoodlesFactoryClient {

	public static void main(String[] args) {
		INoodles noodles = RefNoodlesFactory.createNoodles(LzNoodles.class);
		noodles.desc();
	}

}
