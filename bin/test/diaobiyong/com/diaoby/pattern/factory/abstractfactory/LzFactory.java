package com.diaoby.pattern.factory.abstractfactory;

public class LzFactory extends NoodlesFactory {

	@Override
	public INoodles create() {
		return new LzNoodles();
	}

}
