package com.ch7.test7_10;

public class TestStatic {
	public static void main(String[] args) {
		Student wangYun = new Student();
		wangYun.avgAge = 22;
		System.out.println("王云所在班平均年龄为："+wangYun.avgAge);
		Student liuJT = new Student();
		liuJT.avgAge = 20;
		//共用静态变量avgAge
		System.out.println("王云所在班平均年龄为："+wangYun.avgAge);
		System.out.println("刘静涛所在班平均年龄为："+liuJT.avgAge);
	}
	
}
