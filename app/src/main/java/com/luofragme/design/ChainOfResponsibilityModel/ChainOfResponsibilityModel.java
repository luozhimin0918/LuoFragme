package com.luofragme.design.ChainOfResponsibilityModel;

public class ChainOfResponsibilityModel {

	public static void test() {
		// ��װ������
		Handler handler1 = new ConcreteHandler();
		Handler handler2 = new ConcreteHandler();
		handler1.setSuccessor(handler2);
		// �ύ����
		handler1.handleRequest();
	}

}
