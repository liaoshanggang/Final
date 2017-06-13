package com.ch3.test3_5;

public class Student implements Comparable{
	int stuNum = -1;//学生学号
	String stuName = "";//学生姓名
	
	
	public Student(int stuNum, String stuName) {
		this.stuNum = stuNum;
		this.stuName = stuName;
	}

	//返回该对象的字符串表示，利于输出
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "学号为:"+stuNum+"的学生，姓名为"+stuName;
	}
	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		Student input = (Student) o;
		//此学生对象的学号和指定学生对象的学号比较
		//此学生对象学号若大则res为1，若小res为-1，相同的话res=0;
		int res = stuNum>input.stuNum?1:(stuNum==input.stuNum?0:1);
		//若学号相同，则按照String类自然排序比较学生姓名
		if(res==0){
			res = stuName.compareTo(input.stuName);
		}
		return res;
	}
	
}
