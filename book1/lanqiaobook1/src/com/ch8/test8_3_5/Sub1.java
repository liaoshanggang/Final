package com.ch8.test8_3_5;

public class Sub1 extends Super1{
	public int i = 100;
	public static void main(String[] args) {
		Super1 sup1 = new Sub1();//创建父类对象，用子类实现
		System.out.println(sup1.i);//输出sup1的属性//不被子类覆盖
	}
}
