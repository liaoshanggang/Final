package com.ch1.test1_15;

public class TestEx13 {
	public static void main(String[] args) {
		try {
			String teachers[] = {"lisi","����","С��"};
		for (int i = 0; i < 4; i++) {
			System.out.println(teachers[i]);
		}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("�����쳣�����getMessage()������");
			System.out.println(e.getMessage());
			System.out.println("�����쳣�����printStackTrace������");
			e.printStackTrace();
		}finally{
			System.out.println("��ʾ��ϣ�");
		}
		
	}
}
