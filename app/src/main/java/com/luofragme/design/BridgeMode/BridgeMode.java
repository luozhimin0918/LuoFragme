package com.luofragme.design.BridgeMode;

public class BridgeMode {// ����ģʽ

	public static void test() {
		// ���������ʵ�ֶ���
		MessageImplementor impl = new MessageSMS();
		// ������ͨ��Ϣ����
		AbstractMessage message = new CommonMessage(impl);
		message.sendMessage("�Ӱ���������", "����");

		// ��ʵ�ַ�ʽ�л����ʼ����ٴη���
		impl = new MessageEmail();
		// �����Ӽ���Ϣ����
		message = new UrgencyMessage(impl);
		message.sendMessage("�Ӱ���������", "����");
	}

}
