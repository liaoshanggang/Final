package com.ch3.test3_9;

public class Student implements Comparable{
	int stuNum = -1;
	String stuName = "";
	public Student(int stuNum, String stuName) {
		this.stuNum = stuNum;
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "ѧ��Ϊ��"+stuNum+"��ѧ��,����Ϊ��"+stuName;
	}
	@Override
	public int compareTo(Object o) {
		// TODO �Զ����ɵķ������
		Student input = (Student) o;
		int res = stuNum<input.stuNum?1:(stuNum==input.stuNum?0:-1);
		if(res==0){
			res = stuName.compareTo(input.stuName);
		}
		return res;
	}
	
}
