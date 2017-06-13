package com.ch5.test5_11;

public class TestNewInstance {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.ch5.test5_11.Super");
			Super sup = (Super) c.newInstance();
			System.out.println(sup.supPac);
			System.out.println(sup.supPackage());
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
