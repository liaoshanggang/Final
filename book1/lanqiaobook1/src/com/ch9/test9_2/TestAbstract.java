package com.ch9.test9_2;

public class TestAbstract {
	public static void main(String[] args) {
		Chinese zhangsan = new Chinese();
		System.out.println("***�й��˵���Ϊ***");
		zhangsan.eat();
		zhangsan.work();
		American tom = new American();
		System.out.println("***�����˵���Ϊ***");
		tom.eat();
		tom.work();
		
//		Person liuHL = new Person();����
		
	}
}
