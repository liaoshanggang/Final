package com.ch1.test1_22;

public class TestEx19 {
public static void main(String[] args) {
	Person p1 = new Person();
	Person p2 = new Person();
	try {
		p1.setAge(150);
		System.out.println("���_���g�飺"+p1.getAge());
	} catch (AgeException e) {
		// TODO �Զ����ɵ� catch ��
		System.out.println(e.toString());
	}
	try {
		p2.setAge(60);
		System.out.println("���_���g�飺"+p2.getAge());
	} catch (AgeException e) {
		// TODO �Զ����ɵ� catch ��
		System.out.println(e.toString());
	}
}
}
