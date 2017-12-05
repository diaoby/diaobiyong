package com.diaoby.pattern.builder;

public class Director {
	private Builder builder = new ConcreteBuilder();
	public Product getGsProduct() {
		builder.setProduct("甘肃项目", "4");
		return builder.getProduct();
	}
	public Product getHLJProduct() {
		builder.setProduct("黑龙江项目", "7");
		return builder.getProduct();
	}
}
