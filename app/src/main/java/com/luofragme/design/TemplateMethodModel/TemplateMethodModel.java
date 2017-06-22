package com.luofragme.design.TemplateMethodModel;

public class TemplateMethodModel {
	public static void test() { // ��̬
		BaseTest sina = new SinaTest();
		BaseTest tencent = new TencentTest();
		sina.ask();
		tencent.ask();
	}
}
