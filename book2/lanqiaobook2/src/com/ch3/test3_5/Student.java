package com.ch3.test3_5;

public class Student implements Comparable{
	int stuNum = -1;//ѧ��ѧ��
	String stuName = "";//ѧ������
	
	
	public Student(int stuNum, String stuName) {
		this.stuNum = stuNum;
		this.stuName = stuName;
	}

	//���ظö�����ַ�����ʾ���������
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "ѧ��Ϊ:"+stuNum+"��ѧ��������Ϊ"+stuName;
	}
	@Override
	public int compareTo(Object o) {
		// TODO �Զ����ɵķ������
		Student input = (Student) o;
		//��ѧ�������ѧ�ź�ָ��ѧ�������ѧ�űȽ�
		//��ѧ������ѧ��������resΪ1����СresΪ-1����ͬ�Ļ�res=0;
		int res = stuNum>input.stuNum?1:(stuNum==input.stuNum?0:1);
		//��ѧ����ͬ������String����Ȼ����Ƚ�ѧ������
		if(res==0){
			res = stuName.compareTo(input.stuName);
		}
		return res;
	}
	
}
