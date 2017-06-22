package com.luofragme.design.BuilderMode;

public class BuilderMode {
	public static void test() {
		Cai cai = new ZhangSan();// ��������
		Director d = new Director(cai); // ָ����
		d.zuocai();// ��Ҫָ����Ū�ˣ���ʵָ���߽�����Ū��ȥ�ˡ�
	}
}
