package com.ch5.test5_13;

import java.lang.reflect.Method;

public class TestInvokeMethod {
	public int add(int x,int y){
		return x+y;
	}
	
	public int add(int x){
		return x+1;
	}
	public int multiply(int x,int y){
		return x*y;
	}
	public int multiply(int x){
		return x*x;
	}
	public static void main(String[] args) {
		
		try {
			Class c = TestInvokeMethod.class;
			Object obj = c.newInstance();
			//ͨ�������������������б����Method����
			Method m = c.getDeclaredMethod("multiply", new Class[]{int.class,int.class});
			//invoke(Object o,Object[] args)�������ö���o��Ӧ����
			System.out.println("���÷�����multiply,����ֵΪint��3��4�����Ϊ��"+m.invoke(obj,new Object[]{3,4}));
			Method m2 = c.getDeclaredMethod("add",new Class[]{int.class} );
			System.out.println("���÷�����add,����ֵΪint��18�����Ϊ��"+m2.invoke(obj, new Object[]{18}));
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
}
