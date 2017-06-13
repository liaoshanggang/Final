package com.ch1.test1_18;

public class TestEx16 {
	public static void doEx1(){
		try {
			String teachers[] = {"刘海","里斯","午安了"};
			for (int i = 0; i < 4; i++) {
				System.out.println(teachers[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("doEx1方法中处理数组下标越界异常！");
			throw e;//再次抛出该数组下标越界异常
		}
	}
	public static void main(String[] args) {
//		try {
			doEx1();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			System.out.println("main方法中处理数组下标越界异常！");
//		}finally{
//			System.out.println("程序结束！");
//		}
	}
}
