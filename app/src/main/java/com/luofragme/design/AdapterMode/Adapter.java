package com.luofragme.design.AdapterMode;

public class Adapter {
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	/**
	 * Դ��Adaptee�з���sampleOperation1 �����������ֱ��ί�ɼ���
	 */
	public void sampleOperation1() {
		this.adaptee.sampleOperation1();
	}

	/**
	 * Դ��Adapteeû�з���sampleOperation2 ���������������Ҫ����˷���
	 */
	public void sampleOperation2() {
		// д��صĴ���
	}
}