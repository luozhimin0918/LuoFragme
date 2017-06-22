package com.luofragme.design.CombinationMode;

class File implements Node {
	private String fileName;

	public File(String fileName) {
		this.fileName = fileName;
	}

	public void copy() {
		System.out.println("�����ļ���" + fileName);
	}
}