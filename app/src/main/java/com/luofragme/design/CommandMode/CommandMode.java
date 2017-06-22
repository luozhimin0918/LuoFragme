package com.luofragme.design.CommandMode;

public class CommandMode {
	public static void test() {
		// ����������
		Receiver receiver = new Receiver();
		// ����������󣬲��������Ľ�����
		Command command = new CreateCommand(receiver);

		// ���������ߣ�������������ý�ȥ
		Invoker invoker = new Invoker();
		invoker.setCommand(command);

		// ������Բ���һ��
		invoker.runCommand();
		invoker.unDoCommand();
	}
}