package com.ch3.test3_9;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestComparable {
	public static void main(String[] args) {
		LinkedList stuLL = new LinkedList();
		stuLL.add(new Student(23, "����23"));
		stuLL.add(new Student(3, "����22"));
		stuLL.add(new Student(12, "����12"));
		stuLL.add(new Student(3, "����3"));
		System.out.println("����ǰ��"+stuLL);
		Collections.sort(stuLL);
		Iterator it = stuLL.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
