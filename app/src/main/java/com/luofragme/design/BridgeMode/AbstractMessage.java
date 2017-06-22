package com.luofragme.design.BridgeMode;

public abstract class AbstractMessage {
	// ����һ��ʵ�ֲ��ֵĶ���
	MessageImplementor impl;

	/**
	 * ���췽��������ʵ�ֲ��ֵĶ���
	 * 
	 * @param impl
	 *            ʵ�ֲ��ֵĶ���
	 */
	public AbstractMessage(MessageImplementor impl) {
		this.impl = impl;
	}

	/**
	 * ������Ϣ��ί�ɸ�ʵ�ֲ��ֵķ���
	 * 
	 * @param message
	 *            Ҫ������Ϣ������
	 * @param toUser
	 *            ��Ϣ�Ľ�����
	 */
	public void sendMessage(String message, String toUser) {
		this.impl.send(message, toUser);
	}
}
