package com.diaoby.pattern.factory.abstractfactory;

public class NoodlesFactoryClient {

	public static void main(String[] args) {
		NoodlesFactory f = new LzFactory();
		INoodles noodles = f.create();
		noodles.desc();
	}

}
