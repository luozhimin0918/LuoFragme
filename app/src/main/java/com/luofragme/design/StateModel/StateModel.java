package com.luofragme.design.StateModel;

public class StateModel {// ״̬ģʽ

	public static void test() {
		// ����״̬
		State state = new ConcreteStateB();
		// ��������
		Context context = new Context();
		// ��״̬���õ�������
		context.setState(state);
		// ����
		context.request("test");
	}
}