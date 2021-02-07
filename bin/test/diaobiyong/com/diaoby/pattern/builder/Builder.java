package com.diaoby.pattern.builder;

public interface Builder {
	void setProduct(String name,String age);
	void design();
	void development();
	void test();
	void deploy();
	Product getProduct();
}
