package com.ch9.test9_10;

public class TestInterface2 {
	public static void main(String[] args) {
		//创建并实例化一个实现了电子邮件接口对象email
		EmailInterface email = new Email();
		EmailWriter.writeEmail(email);
		((Email) email).showEmail();
	}
}
