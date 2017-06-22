package com.luofragme.design.SingleMode;

public class SingleMode {
	private static SingleMode mThisMode;

	// �Ѿ�����ʵ����
	// private static final SingleMode mThisMode2 = new SingleMode();

	public static SingleMode getInstance() {// ����ʽ������
		if (mThisMode == null)
			mThisMode = new SingleMode();
		return mThisMode;
	}

	// public static SingleMode getInstance2() {// ����ʽ������
	// return mThisMode2;
	// }
}
