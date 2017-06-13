package com.ch3.test3_10;

public class Student {
	int stuNum = -1;
	String stuName = "";
	public Student(int stuNum, String stuName) {
		super();
		this.stuNum = stuNum;
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "学号为："+stuNum+"的学生姓名为："+stuName;
	}
}
