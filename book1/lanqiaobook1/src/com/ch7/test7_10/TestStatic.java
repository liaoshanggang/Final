package com.ch7.test7_10;

public class TestStatic {
	public static void main(String[] args) {
		Student wangYun = new Student();
		wangYun.avgAge = 22;
		System.out.println("�������ڰ�ƽ������Ϊ��"+wangYun.avgAge);
		Student liuJT = new Student();
		liuJT.avgAge = 20;
		//���þ�̬����avgAge
		System.out.println("�������ڰ�ƽ������Ϊ��"+wangYun.avgAge);
		System.out.println("���������ڰ�ƽ������Ϊ��"+liuJT.avgAge);
	}
	
}
