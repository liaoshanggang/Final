package com.ch1.test1_22;

public class TestEx19 {
public static void main(String[] args) {
	Person p1 = new Person();
	Person p2 = new Person();
	try {
		p1.setAge(150);
		System.out.println("正確年齡為："+p1.getAge());
	} catch (AgeException e) {
		// TODO 自动生成的 catch 块
		System.out.println(e.toString());
	}
	try {
		p2.setAge(60);
		System.out.println("正確年齡為："+p2.getAge());
	} catch (AgeException e) {
		// TODO 自动生成的 catch 块
		System.out.println(e.toString());
	}
}
}
