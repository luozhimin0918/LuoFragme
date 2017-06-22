package com.luofragme.design.BridgeMode;

public class MessageSMS implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {

		System.out.println("ʹ��ϵͳ�ڶ���Ϣ�ķ�����������Ϣ'" + message + "'��" + toUser);
	}

}