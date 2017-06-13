package com.ch3.test3_10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestComparator {
	public static void main(String[] args) {
		LinkedList stuLL = new LinkedList();
		stuLL.add(new Student(1, "��һ"));
		stuLL.add(new Student(3, "����"));
		stuLL.add(new Student(2, "С��"));
		Collections.sort(stuLL, new NameComparator());
		System.out.println("****��ѧ������˳�����ѧ����Ϣ*****");
		Iterator it = stuLL.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Collections.sort(stuLL, new NumComparator());
		System.out.println("*****��ѧ��ѧ��˳�����ѧ����Ϣ******");
		it = stuLL.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}	
}
