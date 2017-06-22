package com.luofragme.design.CombinationMode;

public class CombinationMode {
	public static void test() {
		Folder document = new Folder("�ҵ�����"); // �ҵ������ļ���
		File book = new File("Java���˼��.pdf"); // �ĵ��ļ�
		Folder music = new Folder("�ҵ�����"); // �ҵ������ļ���
		File music1 = new File("�����ҵ���.mp3"); // �����ļ�1
		File music2 = new File("Without You.mp3"); // �����ļ�2
		// ȷ�����νṹ��ϵ
		document.add(book);
		document.add(music);
		music.add(music1);
		music.add(music2);

		document.copy(); // ���ơ��ҵ����ϡ��ļ��У��ݹ�ظ��������������ļ��к��ļ���
	}
}
