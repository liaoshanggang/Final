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
			//通过方法名、参数类型列表，获得Method对象
			Method m = c.getDeclaredMethod("multiply", new Class[]{int.class,int.class});
			//invoke(Object o,Object[] args)方法调用对象o对应方法
			System.out.println("调用方法：multiply,输入值为int型3和4，结果为："+m.invoke(obj,new Object[]{3,4}));
			Method m2 = c.getDeclaredMethod("add",new Class[]{int.class} );
			System.out.println("调用方法：add,输入值为int型18，结果为："+m2.invoke(obj, new Object[]{18}));
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
