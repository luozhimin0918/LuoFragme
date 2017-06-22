package com.luofragme.design.BridgeMode;

public class CommonMessage extends AbstractMessage {

	public CommonMessage(MessageImplementor impl) {
		super(impl);
	}

	@Override
	public void sendMessage(String message, String toUser) {
		// ������ͨ��Ϣ��ֱ�ӵ��ø��෽����������Ϣ����
		super.sendMessage(message, toUser);
	}
}