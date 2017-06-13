package com.ch5.test5_2;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 程序在运行时要求用户输入一个Java类全名，然后需要程序列出这个Java类的所有方法，该如何办呢？
 * @author gg
 *
 */
public class TestRef {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个Java类全名：");
		String cName = in.next();
		showMethods(cName);
	}

	private static void showMethods(String cName) {
		// TODO 自动生成的方法存根
		try {
			Class c;
			c = Class.forName(cName);
			Method m[] = c.getDeclaredMethods();
			System.out.println("该Java类的方法有：");
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i].toString());
				
			}
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
}
