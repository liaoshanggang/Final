package com.ch5.test5_14;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(System.in);
			Class c = Class.forName("java.lang.String");
			System.out.println("请输入班级人数：");
			int stuNum = in.nextInt();
			//创建长度为stuNum的字符串数组
			Object arr = Array.newInstance(c, stuNum);
			System.out.println("请输入需要给学号为？的学生输入姓名：");
			int stuNo = in.nextInt();
			System.out.println("请输入该学生姓名：");
			String stuName = in.next();
			//使用Array类的set方法给数组赋值
			Array.set(arr, (stuNo-1), stuName);
			//使用Array类get方法获取元素的值
			System.out.println("学号为"+stuNo+"的学生姓名为："+Array.get(arr, stuNo-1));
		} catch (Exception e) {
			// TODO 自动生成的 catch块
			e.printStackTrace();
		}
	}
}
