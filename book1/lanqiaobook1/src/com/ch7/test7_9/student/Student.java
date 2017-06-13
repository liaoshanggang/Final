package com.ch7.test7_9.student;

public class Student {
	String stuName;
	public Student(String name){
		this.stuName = name;
	}
	//访问权限为default
//	void showName(){
//		System.out.println("学生姓名为："+this.stuName);
//	}
	public void showName(){
		System.out.println("学生姓名为："+this.stuName);
	}
}
