package com.ch1.test1_2;

import java.util.Scanner;

public class TestEx2 {
	public static void main(String[] args) {
		int appleNum = 0;//ƻ����
		int stuNum = 0;//ѧ����
		System.out.println("***���ڸ������Ƿ�ƻ��***");
		Scanner input = new Scanner(System.in);//8 ��0����
		System.out.println("�������������м���ƻ����");
		appleNum = input.nextInt();
		System.out.println("����������м������ӣ�");
		stuNum = input.nextInt();
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println("����ÿ�����ӷֵö���ƻ����"+appleNum/stuNum);
		System.out.println("�����Ƿǳ����ģ�");
		input.close();//�ر�
	}
}
