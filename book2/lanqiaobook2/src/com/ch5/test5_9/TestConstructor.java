package com.ch5.test5_9;

import java.lang.reflect.Constructor;

public class TestConstructor {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.ch5.test5_9.Sub");
			//返回Constructor对象数组，存放该类或接口的所有构造方法
//			Constructor clist[] = c.getDeclaredConstructors();
			//返回Constructor对象数组，存放该类或接口的所有公有构造方法
			Constructor clist[] = c.getConstructors();
			System.out.println("Sub类getDeclaredConstructors()得到的构造方法如下：");
			int i = 0;
			//遍历所有构造方法
			for (Constructor con : clist) {
				System.out.println("**************************************");
				System.out.println("构造方法"+(i+1)+"名称为："+con.getName());
				System.out.println("该构造方法所在的类或接口为："+con.getDeclaringClass());
				//返回Class对象数组，表示Constructor对象所表示的构造方法的形参类型
				Class ptl[] = con.getParameterTypes();
				for (int j = 0; j < ptl.length; j++) {
					System.out.println("形参"+(j+1)+"类型为："+ptl[j]);
				}
				//返回Class对象数组，表示Constructor对象所表示的方法的异常列表
				Class et1[] = con.getExceptionTypes();
				for (int j = 0; j < et1.length; j++) {
					System.out.println("异常"+(j+1)+"类型为："+et1[j]);
				}
				i++;
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
