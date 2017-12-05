package com.diaoby.pattern.strategy;

public class StrategyClient {

	public static void main(String[] args) {
		StrategyService service = new StrategyService(new Car());
		service.operate();
		service = new StrategyService(new Bus());
		service.operate();
	}

}
