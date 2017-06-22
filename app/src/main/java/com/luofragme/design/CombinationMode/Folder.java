package com.luofragme.design.CombinationMode;

import java.util.ArrayList;

class Folder implements Node {
	private String folderName;
	private ArrayList nodeList = new ArrayList(); // ���ڴ洢�ļ����µ��ļ��л��ļ�����Ϣ

	public Folder(String folderName) {
		this.folderName = folderName;
	}

	public void add(Node node) { // �����ļ����ļ���
		nodeList.add(node);
	}

	public void copy() { // �ļ��и��Ʋ���ʵ�ֵݹ�
		System.out.println("�����ļ��У�" + folderName);
		for (int i = 0; i < nodeList.size(); i++) {
			Node node = (Node) nodeList.get(i);
			node.copy();
		}
	}
}
