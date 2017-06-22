package com.luofragme.design.StrategyMode;

public class Context {

	private IStrategy strategy;

	// ���캯����Ҫ��ʹ���ĸ����
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void operate() {
		this.strategy.operate();
	}

}
