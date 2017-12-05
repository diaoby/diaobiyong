package com.diaoby.pattern.factory.simplefactory;

public class MulWayNoodlesFactoryClient {

	public static void main(String[] args) {
		INoodles lz = MulWayNoodlesFactory.createLz();
		lz.desc();
	}

}
