package com.ch9.test9_2;

public class TestAbstract {
	public static void main(String[] args) {
		Chinese zhangsan = new Chinese();
		System.out.println("***中国人的行为***");
		zhangsan.eat();
		zhangsan.work();
		American tom = new American();
		System.out.println("***美国人的行为***");
		tom.eat();
		tom.work();
		
//		Person liuHL = new Person();报错
		
	}
}
