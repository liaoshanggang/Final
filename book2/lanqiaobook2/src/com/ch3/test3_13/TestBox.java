package com.ch3.test3_13;

public class TestBox {
	public static void main(String[] args) {
		Integer int1 = 3;
		System.out.println("过年了，年龄增长了一岁，现在年龄是："+(int1+1));
		Integer int2 = 3;
		System.out.println("int1.equals(int2)（值均为3）的结果是："+(int1.equals(int2)));
		System.out.println("int1==int2（值都为3）的结果是："+(int1==int2));
		int1 = 234;
		int2 = 234;
		System.out.println("int1.equals(int2)（值均为323）的结果是："+(int1.equals(int2)));
		System.out.println("int1==int2(值为234)的结果为："+(int1==int2));
	}
}
