package com.diaoby.pattern.factory.simplefactory;

public class SimpleFactoryClient {

	public static void main(String[] args) {
		INoodles noodles = SimpleNoodlesFactory.createNoodles(1);
		noodles.desc();
	}

}
