package com.ch9.test9_10;

public class TestInterface2 {
	public static void main(String[] args) {
		//������ʵ����һ��ʵ���˵����ʼ��ӿڶ���email
		EmailInterface email = new Email();
		EmailWriter.writeEmail(email);
		((Email) email).showEmail();
	}
}
