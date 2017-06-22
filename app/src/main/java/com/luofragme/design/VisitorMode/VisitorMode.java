package com.luofragme.design.VisitorMode;

public class VisitorMode {

	public void ride(Horse h) {
		System.out.println("����");
	}

	public void ride(WhiteHorse wh) {
		System.out.println("�����");
	}

	public void ride(BlackHorse bh) {
		System.out.println("�����");
	}

	public static void test() {
		Horse wh = new WhiteHorse();
		Horse bh = new BlackHorse();
		VisitorMode mozi = new VisitorMode();
		mozi.ride(wh);
		mozi.ride(bh);
	}

}