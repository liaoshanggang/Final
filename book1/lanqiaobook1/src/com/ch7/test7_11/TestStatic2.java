package com.ch7.test7_11;

public class TestStatic2 {
	public static void main(String[] args) {
		//����.��̬����
		Student.showAvgAge();//���þ�̬����
		//����.�����
		System.out.println("��̬����������ڰ�ƽ������Ϊ��"+Student.avgAge);
		//��ʵ��.��̬����
		System.out.println("��̬����������ڰ�ƽ������Ϊ��"+new Student().avgAge);
	}
}
