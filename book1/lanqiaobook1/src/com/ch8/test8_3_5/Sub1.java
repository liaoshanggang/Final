package com.ch8.test8_3_5;

public class Sub1 extends Super1{
	public int i = 100;
	public static void main(String[] args) {
		Super1 sup1 = new Sub1();//�����������������ʵ��
		System.out.println(sup1.i);//���sup1������//�������า��
	}
}
