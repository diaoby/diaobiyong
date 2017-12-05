package com.diaoby.pattern.builder;

public class Product {
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public void showProduct() {
		System.out.println("产品名称:"+name);
		System.out.println("产品使用年限:"+age);
	}
}
