package com.luofragme.design.ChainOfResponsibilityModel;

public abstract class Handler {

	/**
	 * ���к�̵����ζ���
	 */
	protected Handler successor;

	/**
	 * ʾ�⴦������ķ�������Ȼ���ʾ�ⷽ����û�д�������� ��ʵ���ǿ��Դ�������ģ����ݾ�����Ҫ��ѡ���Ƿ񴫵ݲ���
	 */
	public abstract void handleRequest();

	/**
	 * ȡֵ����
	 */
	public Handler getSuccessor() {
		return successor;
	}

	/**
	 * ��ֵ���������ú�̵����ζ���
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

}
