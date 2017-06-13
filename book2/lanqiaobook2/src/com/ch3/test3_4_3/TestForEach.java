package com.ch3.test3_4_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestForEach {
	public static void main(String[] args) {
		String[] stuArr = {"张三","李斯","王五","小六"};
		System.out.println("传统for循环遍历");
		for (int i = 0; i < stuArr.length; i++) {
			System.out.println(stuArr[i]);
		}
		System.out.println("增强for循环遍历");
		for(String s:stuArr){
			System.out.println(s);
		}
		Set nameSet = new HashSet();
		nameSet.add("李四");
		nameSet.add("王五");
		nameSet.add("小六");
		nameSet.add("小二");
		System.out.println("用iterator遍历");
		Iterator it = nameSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("用增强for循环遍历");
		for (Object stu : nameSet) {
			System.out.println((String)stu);
		}
	}
}
