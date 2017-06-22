package com.luofragme.design.MemoMode;

public class Originator {

	private String state;

	/**
	 * ��������������һ���µı���¼����
	 */
	public Memento createMemento() {
		return new Memento(state);
	}

	/**
	 * �������˻ָ�������¼���������ص�״̬
	 */
	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("��ǰ״̬��" + this.state);
	}

}