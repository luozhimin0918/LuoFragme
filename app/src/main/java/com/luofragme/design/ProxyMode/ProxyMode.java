package com.luofragme.design.ProxyMode;

public class ProxyMode {
	/**
	 * ����ģʽ
	 * 
	 * @param args
	 */
	public static void test() {
		// ����Ҫִ�ж��ⷽ����
		Italk people1 = new People("����ɢ��", "18");
		people1.talk("No ProXY Test");
		System.out.println("-----------------------------");
		// ��Ҫִ�ж��ⷽ����
		TalkProxy talker = new TalkProxy(people1);
		talker.talk("ProXY Test", "������");
	}
}