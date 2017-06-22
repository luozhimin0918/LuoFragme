package com.luofragme.design.CloneMode;

public class CloneMode {
	public static void test() {
		AbstractMonkey a1 = new RealMonkey();
		AbstractMonkey a2 = (AbstractMonkey) a1.clone();
		AbstractMonkey a3 = (AbstractMonkey) a1.clone();
		// AbstractMonkey a3 = (AbstractMonkey) a2.clone();
		// ����ͨ�� a2 ��¡�Լ�Ҳ�У�˵�� a2 �Ѿ���һ����ʵ����
		// ���еĶ�����
		a1.dothing();
		a2.dothing();
		a3.dothing();
	}
}
