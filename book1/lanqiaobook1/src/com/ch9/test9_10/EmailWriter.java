package com.ch9.test9_10;

import java.util.Scanner;

public class EmailWriter {
	//����д�ʼ��ľ�̬�������β���EmailInterface
	public static void writeEmail(EmailInterface email){
		Scanner in = new Scanner(System.in);
		System.out.println("�����뷢�������䣺");
		email.setSendAdd(in.next());
		System.out.println("���������������䣺");
		email.receiveAdd(in.next());
		System.out.println("�������������⣺");
		email.setEmailTitle(in.next());
		System.out.println("�������ʼ����ݣ�");
		email.writeEmail(in.next());
//		email.showEmail();//�����޷�ͨ������Ϊ�β�email��EmailInterface�ӿڣ�û�д˷���
	}
}
