package com.ch7.test7_13;

public class Student {
	private static String staticName = "��̬����";//��̬����
	private String stuName = "";//ѧ��������������˽�б���
	//ʹ�þ�̬��ʼ�����ʼ��
	static{
		System.out.println("***ʹ�þ�̬��ʼ�����ʼ����");
		System.out.println("��̬������ʾ��̬����ֵ��"+staticName);
	}
	//ʹ�ó�ʼ�����ʼ��
	{
		this.stuName = "�׾�";
		System.out.println("***ʹ�ó�ʼ�����ʼ��***");
		System.out.println("��ͨ������ʾʵ������ֵ��"+stuName);
		System.out.println("��ͨ������ʾ��̬����ֵ��"+staticName);
	}
	//���췽�����û���ʼ������ĳ�Ա����
	public Student(String name){
		this.stuName = stuName;
		System.out.println("***ʹ���ɲι��췽��������ʼ��***");
		System.out.println("���췽������ʾʵ������ֵ��"+stuName);
		System.out.println("���췽������ʾ��̬����ֵ��"+staticName);
	}
	public static void main(String[] args) {
		Student stu = new Student("����");
	}
}
