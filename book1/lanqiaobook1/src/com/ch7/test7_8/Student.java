package com.ch7.test7_8;
//Student����һ������ģʽ����
public class Student {
	//ѧ������
	String stuName;
	static Student stu = new Student("����");
	//���췽��˽�л�
	private Student(String name){
		this.stuName = name;
		System.out.println("ѧ������Ϊ��"+this.stuName);
	}
	//��̬���з������������
	public static Student getStudent(){
		return stu;
	}
}
