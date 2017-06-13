package com.ch3.test3_10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestComparator {
	public static void main(String[] args) {
		LinkedList stuLL = new LinkedList();
		stuLL.add(new Student(1, "张一"));
		stuLL.add(new Student(3, "李四"));
		stuLL.add(new Student(2, "小二"));
		Collections.sort(stuLL, new NameComparator());
		System.out.println("****按学生姓名顺序输出学生信息*****");
		Iterator it = stuLL.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Collections.sort(stuLL, new NumComparator());
		System.out.println("*****按学生学号顺序输出学生信息******");
		it = stuLL.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}	
}
