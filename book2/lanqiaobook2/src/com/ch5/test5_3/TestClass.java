package com.ch5.test5_3;

public class TestClass {
	public static void main(String[] args) {
		//���������ģ��������δ֪����Class<?>��ʾ
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
		String name = new String("����ʿ");
		c4 = name.getClass();
		c5 = name.getClass().getSuperclass();
		
		System.out.println("Class.forName(\"java.util.Object\")�����ƣ�"+c1.getName());
		System.out.println("new TestClass().getClass()�����ƣ�"+c2.getName());
		System.out.println("TestClass.class�����ƣ�"+c3.getName());
		System.out.println("String name=\"����ʿ\"");
		System.out.println("name.getClass()�����ƣ�"+c4.getName());
		System.out.println("name.getClass().getSuperClass()�����ƣ�"+c5.getName());
	}
}
