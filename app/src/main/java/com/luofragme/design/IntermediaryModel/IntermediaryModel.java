package com.luofragme.design.IntermediaryModel;

public class IntermediaryModel {
	public static void test1() {

		AbstractColleague collA = new ColleagueA();
		AbstractColleague collB = new ColleagueB();

		System.out.println("==========����AӰ��B==========");
		collA.setNumber(1288, collB);
		System.out.println("collA��numberֵ��" + collA.getNumber());
		System.out.println("collB��numberֵ��" + collB.getNumber());

		System.out.println("==========����BӰ��A==========");
		collB.setNumber(87635, collA);
		System.out.println("collB��numberֵ��" + collB.getNumber());
		System.out.println("collA��numberֵ��" + collA.getNumber());
	}

	public static void test2() {
		AbstractColleague2 collA = new ColleagueA2();
		AbstractColleague2 collB = new ColleagueB2();

		AbstractMediator am = new Mediator(collA, collB);

		System.out.println("==========ͨ������AӰ��B==========");
		collA.setNumber(1000, am);
		System.out.println("collA��numberֵΪ��" + collA.getNumber());
		System.out.println("collB��numberֵΪA��10����" + collB.getNumber());

		System.out.println("==========ͨ������BӰ��A==========");
		collB.setNumber(1000, am);
		System.out.println("collB��numberֵΪ��" + collB.getNumber());
		System.out.println("collA��numberֵΪB��0.1����" + collA.getNumber());

	}
}
