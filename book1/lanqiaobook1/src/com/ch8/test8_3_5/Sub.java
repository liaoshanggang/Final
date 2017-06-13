package com.ch8.test8_3_5;

public class Sub extends Super{
	public int i = 100;//子类同名属性i,赋值100
	public static void main(String[] args) {
		Sub sub = new Sub();//创建子类对象
		System.out.println("输出的是子类属性："+sub.i);//输出子类对象i的属性
	}
}
