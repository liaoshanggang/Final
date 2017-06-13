package com.ch5.test5_7;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class TestField {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.ch5.test5_5.Sub");
			Scanner in = new Scanner(System.in);
			System.out.println("请输入你获取Sub类的哪个属性的类型：");
			String name = in.next();
			//通过指定属性名获取属性对象
			Field sf = c.getDeclaredField(name);
			//得到属性类型
			System.out.println("Sub类"+name+"属性的类型为："+sf.getType());
			System.out.println("************************************");
			//返回Filed对象数组，存放该类或接口的所有属性（不含继承的）
//			Field flist[] = c.getDeclaredFields();
			Field flist[] = c.getFields();
			System.out.println("Sub类getDeclaredFileds()得到的属性如下");
			for (int i = 0; i < flist.length; i++) {
				System.out.println("**********************************");
				Field field = flist[i];
				//得到属性名
				System.out.println("属性"+(i+1)+"名称为："+field.getName());
				System.out.println("该属性所在的类或接口为："+field.getClass());
				System.out.println("该属性的类型为："+field.getType());
				//以整数形式返回由此Field对象表示的属性的Java访问权限修饰符
				int m = field.getModifiers();
				System.out.println("该属性的修饰符为："+Modifier.toString(m));
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
