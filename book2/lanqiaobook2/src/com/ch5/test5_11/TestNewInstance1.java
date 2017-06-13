package com.ch5.test5_11;

import java.lang.reflect.Constructor;

public class TestNewInstance1 {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.ch5.test5_11.Super");
			//返回一个指定参数列表（int.class,int.class）的Constructor对象
			Constructor con =  c.getDeclaredConstructor(new Class[]{int.class,int.class});
			//通过Constructor的newInstance(Object[] args)方法创建对象，参数为对象列表
			//参数列表对基本数据类型支持自动装箱拆箱，所以也可以写成newInstance(21,23)
			Super sup = (Super) con.newInstance(new Object[]{21,22});
			System.out.println(sup.supPackage());
			//返回一个无参的Constructor对象
			Constructor con2 = c.getDeclaredConstructor();
			Super sup2 = (Super) con2.newInstance();
			System.out.println(sup2.supPac);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
