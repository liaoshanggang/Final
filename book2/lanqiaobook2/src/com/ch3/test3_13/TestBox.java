package com.ch3.test3_13;

public class TestBox {
	public static void main(String[] args) {
		Integer int1 = 3;
		System.out.println("�����ˣ�����������һ�꣬���������ǣ�"+(int1+1));
		Integer int2 = 3;
		System.out.println("int1.equals(int2)��ֵ��Ϊ3���Ľ���ǣ�"+(int1.equals(int2)));
		System.out.println("int1==int2��ֵ��Ϊ3���Ľ���ǣ�"+(int1==int2));
		int1 = 234;
		int2 = 234;
		System.out.println("int1.equals(int2)��ֵ��Ϊ323���Ľ���ǣ�"+(int1.equals(int2)));
		System.out.println("int1==int2(ֵΪ234)�Ľ��Ϊ��"+(int1==int2));
	}
}
