package com.ch1.test1_21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEx18 {
	private static void p() {
		int appleNum = 0;// ƻ����
		int stuNum = 0;// ѧ����
		System.out.println("***���ڸ������Ƿ�ƻ��***");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);// 8 ��0����
		System.out.println("�������������м���ƻ����");
		appleNum = input.nextInt();
		System.out.println("����������м������ӣ�");
		stuNum = input.nextInt();//ݔ��abc��ϵ�y���׳�InputMismatchException����
		System.out.println("����ÿ�����ӷֵö���ƻ����" + appleNum / stuNum);
		System.out.println("�����Ƿǳ����ģ�");
	}
	public static void main(String[] args) {
		try {
			p();//������ֱ���{���߲��@��̎����
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("main����̎��InputMismatchException����");
		}
	}
}
