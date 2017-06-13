package com.ch1.test1_21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEx18 {
	private static void p() {
		int appleNum = 0;// 苹果数
		int stuNum = 0;// 学生数
		System.out.println("***现在给孩子们分苹果***");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);// 8 ，0错误
		System.out.println("请输入桌子上有几个苹果：");
		appleNum = input.nextInt();
		System.out.println("请输入班上有几个孩子：");
		stuNum = input.nextInt();//輸入abc，系統會抛出InputMismatchException異常
		System.out.println("班上每个孩子分得多少苹果：" + appleNum / stuNum);
		System.out.println("孩子们非常开心！");
	}
	public static void main(String[] args) {
		try {
			p();//方法的直接調用者捕獲、處理異常
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("main方法處理InputMismatchException異常");
		}
	}
}
