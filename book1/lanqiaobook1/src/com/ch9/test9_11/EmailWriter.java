package com.ch9.test9_11;

import java.util.Scanner;

public class EmailWriter {
	//����д�ʼ��ľ�̬�������β���Email........................
	//����д�ʼ��ľ�̬�������β���Email�ࣨ������ӿڱ�̣�
	//�ββ�����EmailInterface�ӿڣ������޷�����PortInterface�ӿڵķ���
	/*public static void writeEmail(Email email)*/
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
