package com.ch3.test3_4_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestForEach {
	public static void main(String[] args) {
		String[] stuArr = {"����","��˹","����","С��"};
		System.out.println("��ͳforѭ������");
		for (int i = 0; i < stuArr.length; i++) {
			System.out.println(stuArr[i]);
		}
		System.out.println("��ǿforѭ������");
		for(String s:stuArr){
			System.out.println(s);
		}
		Set nameSet = new HashSet();
		nameSet.add("����");
		nameSet.add("����");
		nameSet.add("С��");
		nameSet.add("С��");
		System.out.println("��iterator����");
		Iterator it = nameSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("����ǿforѭ������");
		for (Object stu : nameSet) {
			System.out.println((String)stu);
		}
	}
}
