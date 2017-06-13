package com.ch7.test7_8;
//Student类是一个单例模式的类
public class Student {
	//学生姓名
	String stuName;
	static Student stu = new Student("王云");
	//构造方法私有化
	private Student(String name){
		this.stuName = name;
		System.out.println("学生姓名为："+this.stuName);
	}
	//静态公有方法返回类对象
	public static Student getStudent(){
		return stu;
	}
}
