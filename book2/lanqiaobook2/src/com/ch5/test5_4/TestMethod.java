package com.ch5.test5_4;

import java.lang.reflect.Method;

public class TestMethod {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("org.w3c.dom.NodeList");
			//返回Method对象数组，存放该类或接口的所有方法（不含继承的）
			Method mlist[] = c.getDeclaredMethods();
			System.out.println("NodeList类getDeclaredMethods()得到的方法如下：");
			//遍历所有方法
			for (int i = 0; i < mlist.length; i++) {
				System.out.println("*********************************");
				Method method = mlist[i];
				//得到方法名
				System.out.println("方法"+(i+1)+"名称为："+method.getName());
				System.out.println("该方法所在的类或接口为："+method.getDeclaringClass());
				//返回Class对象数组，表示Method对象所表示的方法的形参类型
				Class ptl[] = method.getParameterTypes();
				for (int j = 0; j < ptl.length; j++) {
					System.out.println("形参"+(j+1)+"类型为："+ptl[j]);
				}
				//返回Class对象数字，表示Method对象所表示的方法的异常列表
				Class etl[] = method.getExceptionTypes();
				for (int j = 0; j < etl.length; j++) {
					 System.out.println("异常"+(j+1)+"类型为："+etl[j]);
				}
				System.out.println("返回值类型为："+method.getReturnType());
			}
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
