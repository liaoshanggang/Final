package com.ch1.test1_8;

import java.util.Scanner;

public class TestEx7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// 8 ��0����
		try {
			String teachers[] = { "����", "�e��", "���ٶ�" };
			for (int i = 0; i < teachers.length; i++) {
				System.out.println(teachers[i]);
			}
			int appleNum = 0;// ƻ����
			int stuNum = 0;// ѧ����
			System.out.println("***���ڸ������Ƿ�ƻ��***");
			System.out.println("�������������м���ƻ����");
			appleNum = input.nextInt();
			System.out.println("����������м������ӣ�");
			stuNum = input.nextInt();
			// Exception in thread "main" java.lang.ArithmeticException: / by
			// zero
			System.out.println("����ÿ�����ӷֵö���ƻ����" + appleNum / stuNum);
			System.out.println("�����Ƿǳ����ģ�");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("���M��Խ�磬Ո�޸ĳ���");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("�����쳣���������");
		}
		System.out.println("����ִ���ꮅ��");
		input.close();// �ر�
	}
}
