package com.ch1.test1_16;

import java.util.Scanner;

public class TestEx14 {
	public static void main(String[] args) {
		try {
			int appleNum = 0;
			int stuNum = 0;
			System.out.println("***现在给孩子们分苹果***");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入桌子上有几个苹果：");
			appleNum = sc.nextInt();
			//q Exception in thread "main" java.util.InputMismatchException
			System.out.println("请输入班上有几个孩子：");
			stuNum = sc.nextInt();
			System.out.println("班上每个孩子分得多少苹果："+appleNum/stuNum);
			System.out.println("孩子们非常开心！");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("数组下标越界，请修改程序！");
			
		}
		System.out.println("程序执行完毕！");
	}
}
