package com.ch9.test9_11;

public class TestInterface3 {
	public static void main(String[] args) {
		//������ʵ����һ��Email��Ķ���email
		Email email = new Email();
		EmailWriter.writeEmail(email);
		email.showEmail();
	}
}
