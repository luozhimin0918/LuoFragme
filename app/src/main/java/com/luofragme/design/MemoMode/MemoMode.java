package com.luofragme.design.MemoMode;

public class MemoMode {//����¼ģʽ

	public static void test() {

		Originator o = new Originator();
		Caretaker c = new Caretaker();
		// �ı为���˶����״̬
		o.setState("On");
		// ��������¼���󣬲��������˶����״̬��������
		c.saveMemento(o.createMemento());
		// �޸ķ����˵�״̬
		o.setState("Off");
		// �ָ������˶����״̬
		o.restoreMemento(c.retrieveMemento());

		System.out.println(o.getState());
	}

}
