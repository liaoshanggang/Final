package com.ch3.test3_5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet2 {
public static void main(String[] args) {
	//�������TreeSet�洢ѧ������
	Set stuTS = new TreeSet();
	stuTS.add(new Student(1,"����"));
	stuTS.add(new Student(2,"����2"));
	stuTS.add(new Student(3,"����3"));
//	System.out.println(stuTS);
	Iterator it = stuTS.iterator();
	while(it.hasNext()){
	System.out.println(it.next());
	}
}
}
