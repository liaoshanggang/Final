package com.ch3.test3_10;

public class Student {
	int stuNum = -1;
	String stuName = "";
	public Student(int stuNum, String stuName) {
		super();
		this.stuNum = stuNum;
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "ѧ��Ϊ��"+stuNum+"��ѧ������Ϊ��"+stuName;
	}
}
