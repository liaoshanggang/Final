package com.ch9.test9_11;

public class TestInterface3 {
	public static void main(String[] args) {
		//创建并实例化一个Email类的对象email
		Email email = new Email();
		EmailWriter.writeEmail(email);
		email.showEmail();
	}
}
