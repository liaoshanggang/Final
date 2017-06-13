package com.ch1.test1_8;

import java.util.Scanner;

public class TestEx7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// 8 ，0错误
		try {
			String teachers[] = { "劉海", "積分", "加速度" };
			for (int i = 0; i < teachers.length; i++) {
				System.out.println(teachers[i]);
			}
			int appleNum = 0;// 苹果数
			int stuNum = 0;// 学生数
			System.out.println("***现在给孩子们分苹果***");
			System.out.println("请输入桌子上有几个苹果：");
			appleNum = input.nextInt();
			System.out.println("请输入班上有几个孩子：");
			stuNum = input.nextInt();
			// Exception in thread "main" java.lang.ArithmeticException: / by
			// zero
			System.out.println("班上每个孩子分得多少苹果：" + appleNum / stuNum);
			System.out.println("孩子们非常开心！");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("數組下標越界，請修改程序！");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("算术异常，请检查程序！");
		}
		System.out.println("程序执行完畢！");
		input.close();// 关闭
	}
}
