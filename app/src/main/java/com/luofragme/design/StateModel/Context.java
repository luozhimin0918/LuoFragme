package com.luofragme.design.StateModel;

public class Context {
	// ����һ��State���͵Ķ���ʵ��
	private State state;

	public void setState(State state) {
		this.state = state;
	}

	/**
	 * �û�����Ȥ�Ľӿڷ���
	 */
	public void request(String sampleParameter) {
		// ת��state������
		state.handle(sampleParameter);
	}
}
