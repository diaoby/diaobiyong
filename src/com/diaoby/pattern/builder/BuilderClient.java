package com.diaoby.pattern.builder;

public class BuilderClient {

	public static void main(String[] args) {
		Director director = new Director();  
		Product  gs = director.getGsProduct();
		gs.showProduct();
		Product hlj = director.getHLJProduct();
		hlj.showProduct();
	}

}
