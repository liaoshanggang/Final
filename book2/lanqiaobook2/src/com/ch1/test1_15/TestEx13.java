package com.ch1.test1_15;

public class TestEx13 {
	public static void main(String[] args) {
		try {
			String teachers[] = {"lisi","王五","小六"};
		for (int i = 0; i < 4; i++) {
			System.out.println(teachers[i]);
		}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("调用异常对象的getMessage()方法：");
			System.out.println(e.getMessage());
			System.out.println("调用异常对象的printStackTrace方法：");
			e.printStackTrace();
		}finally{
			System.out.println("显示完毕！");
		}
		
	}
}
