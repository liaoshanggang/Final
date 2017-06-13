package com.ch9.test9_11;

import java.util.Scanner;

public class EmailWriter {
	//定义写邮件的静态方法，形参是Email........................
	//定义写邮件的静态方法，形参是Email类（非面向接口编程）
	//形参不能是EmailInterface接口，否则无法调用PortInterface接口的方法
	/*public static void writeEmail(Email email)*/
	public static void writeEmail(EmailInterface email){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入发信者邮箱：");
		email.setSendAdd(in.next());
		System.out.println("请输入收信者邮箱：");
		email.receiveAdd(in.next());
		System.out.println("请输入邮箱主题：");
		email.setEmailTitle(in.next());
		System.out.println("请输入邮件内容：");
		email.writeEmail(in.next());
//		email.showEmail();//编译无法通过，因为形参email是EmailInterface接口，没有此方法
	}
}
