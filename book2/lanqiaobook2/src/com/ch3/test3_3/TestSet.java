package com.ch3.test3_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		//创建一个HashSet对象,存放学生姓名信息
		Set nameSet = new HashSet();
		nameSet.add("王云");
		nameSet.add("刘锦涛");
		nameSet.add("李维斯");
		nameSet.add("思维");
		System.out.println("再次添加王云是否成功："+nameSet.add("王云"));
		System.out.println("再次添加思维是否成功："+nameSet.add("思维"));
		System.out.println("显示集合内容："+nameSet);
		System.out.println("集合里是否包含思维："+nameSet.contains("思维"));
		System.out.println("从集合里删除\"思维\"...");
		System.out.println("正在删除思维："+nameSet.remove("思维"));
		System.out.println("集合里是否包含思维："+nameSet.contains("思维"));
		System.out.println("显示集合内容："+nameSet);
		System.out.println("集合中元素的个数："+nameSet.size());
//		System.out.println("正在清空集合元素....");
//		nameSet.clear();
//		System.out.println("集合是否清空："+nameSet.isEmpty());
		System.out.println("显示集合内容："+nameSet);
		System.out.println("使用toArray:");
		Object[] obj = nameSet.toArray();
		System.out.println(obj.length);
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].hashCode()+obj[i].toString()+obj[i].getClass());
		}
		Iterator it = nameSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		nameSet.add(121);
		nameSet.add(23.324);
		nameSet.add(true);
		nameSet.add(nameSet);
		nameSet.add(23f);
		nameSet.add('1');
		nameSet.add(obj);
		System.out.println("显示内容"+nameSet);
		
	}
}
