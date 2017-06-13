package com.ch1.test1_2;

import java.util.Scanner;

public class TestEx2 {
	public static void main(String[] args) {
		int appleNum = 0;//苹果数
		int stuNum = 0;//学生数
		System.out.println("***现在给孩子们分苹果***");
		Scanner input = new Scanner(System.in);//8 ，0错误
		System.out.println("请输入桌子上有几个苹果：");
		appleNum = input.nextInt();
		System.out.println("请输入班上有几个孩子：");
		stuNum = input.nextInt();
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println("班上每个孩子分得多少苹果："+appleNum/stuNum);
		System.out.println("孩子们非常开心！");
		input.close();//关闭
	}
}
