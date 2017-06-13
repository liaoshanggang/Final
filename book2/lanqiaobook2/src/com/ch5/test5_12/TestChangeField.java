package com.ch5.test5_12;

import java.lang.reflect.Field;

import com.ch5.test5_11.Super;

public class TestChangeField {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.ch5.test5_11.Super");
			Super sup = (Super) c.newInstance();
			//通过属性名获得Field对象
			Field f = c.getDeclaredField("supPri");
			//取消属性的访问权限控制，即使private属性也可以进行访问
			f.setAccessible(true);
			//调用get(Object o)方法取得对象o对应属性值
			System.out.println("取消访问权限控制后访问supPri,其值为："+f.get(sup));
			//调用set(Object o,Object v)方法设置对象对应属性值
			f.set(sup, 20);
			System.out.println("f.set(sup,20)后访问supPri,其值为"+f.get(sup));
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
