package com.ch7.test7_11;

public class TestStatic2 {
	public static void main(String[] args) {
		//类名.静态方法
		Student.showAvgAge();//调用静态方法
		//类名.类变量
		System.out.println("静态变量输出所在班平均年龄为："+Student.avgAge);
		//类实例.静态变量
		System.out.println("静态变量输出所在班平均年龄为："+new Student().avgAge);
	}
}
