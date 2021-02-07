package com.diaoby.pattern.strategy;

public class StrategyService {
	private IStrategy strategy;
	public StrategyService(IStrategy strategy) {
		this.strategy = strategy;
	}
	public void operate() {
		strategy.operate();
	}
}
