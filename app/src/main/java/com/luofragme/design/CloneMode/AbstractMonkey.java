package com.luofragme.design.CloneMode;

public abstract class AbstractMonkey implements Cloneable {
	// �����൱����������ڲ����������Լ���һ���ط�
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}

	public abstract void dothing();
}
