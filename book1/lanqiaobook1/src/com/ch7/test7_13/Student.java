package com.ch7.test7_13;

public class Student {
	private static String staticName = "静态姓名";//静态变量
	private String stuName = "";//学生姓名————私有变量
	//使用静态初始化块初始化
	static{
		System.out.println("***使用静态初始化块初始化：");
		System.out.println("静态快里显示静态变量值："+staticName);
	}
	//使用初始化块初始化
	{
		this.stuName = "雷静";
		System.out.println("***使用初始化块初始化***");
		System.out.println("普通块里显示实例变量值："+stuName);
		System.out.println("普通块里显示静态变量值："+staticName);
	}
	//构造方法，用户初始化对象的成员变量
	public Student(String name){
		this.stuName = stuName;
		System.out.println("***使用由参构造方法函数初始化***");
		System.out.println("构造方法里显示实例变量值："+stuName);
		System.out.println("构造方法里显示静态变量值："+staticName);
	}
	public static void main(String[] args) {
		Student stu = new Student("王云");
	}
}
