package com.luofragme.design.DecorativeMode;

public class DecorativeMode {// װ��ģʽ
	public static void test() {
		Component component = new ConcreteComponent();
		Decorator decorator = new ConcreteDecorator(component);
		// �ͻ��˲���, ��������������
		decorator.operation();
	}
}
