package com.diaoby.pattern.builder;

public class ConcreteBuilder implements Builder {
	private Product product = new Product();

	@Override
	public void design() {
		System.out.println(product.getName()+"设计完成");
	}

	@Override
	public void development() {
		System.out.println(product.getName()+"开发完成");
	}

	@Override
	public void test() {
		System.out.println(product.getName()+"测试完成");
	}

	@Override
	public void deploy() {
		System.out.println(product.getName()+"部署完成");
	}

	@Override
	public Product getProduct() {
		return product;
	}

	@Override
	public void setProduct(String name, String age) {
		product.setAge(age);
		product.setName(name);
		design();
		development();
		test();
		deploy();
	}

}
