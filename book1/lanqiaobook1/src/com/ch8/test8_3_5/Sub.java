package com.ch8.test8_3_5;

public class Sub extends Super{
	public int i = 100;//����ͬ������i,��ֵ100
	public static void main(String[] args) {
		Sub sub = new Sub();//�����������
		System.out.println("��������������ԣ�"+sub.i);//����������i������
	}
}
