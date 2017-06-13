package com.ch5.test5_3;

public class TestClass {
	public static void main(String[] args) {
		//如果将被建模的类类型未知，用Class<?>表示
		Class<?> c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;
		Class<?> c4 = null;
		Class<?> c5 = null;
		
		try {
			c1 = Class.forName("java.lang.Object");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		c2 = new TestClass().getClass();
		c3 = TestClass.class;
		String name = new String("大力士");
		c4 = name.getClass();
		c5 = name.getClass().getSuperclass();
		
		System.out.println("Class.forName(\"java.util.Object\")类名称："+c1.getName());
		System.out.println("new TestClass().getClass()类名称："+c2.getName());
		System.out.println("TestClass.class类名称："+c3.getName());
		System.out.println("String name=\"大力士\"");
		System.out.println("name.getClass()类名称："+c4.getName());
		System.out.println("name.getClass().getSuperClass()类名称："+c5.getName());
	}
}
