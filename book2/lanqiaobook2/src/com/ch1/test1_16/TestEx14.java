package com.ch1.test1_16;

import java.util.Scanner;

public class TestEx14 {
	public static void main(String[] args) {
		try {
			int appleNum = 0;
			int stuNum = 0;
			System.out.println("***���ڸ������Ƿ�ƻ��***");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("�������������м���ƻ����");
			appleNum = sc.nextInt();
			//q Exception in thread "main" java.util.InputMismatchException
			System.out.println("����������м������ӣ�");
			stuNum = sc.nextInt();
			System.out.println("����ÿ�����ӷֵö���ƻ����"+appleNum/stuNum);
			System.out.println("�����Ƿǳ����ģ�");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("�����±�Խ�磬���޸ĳ���");
			
		}
		System.out.println("����ִ����ϣ�");
	}
}
