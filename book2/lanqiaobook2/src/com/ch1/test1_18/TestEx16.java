package com.ch1.test1_18;

public class TestEx16 {
	public static void doEx1(){
		try {
			String teachers[] = {"����","��˹","�簲��"};
			for (int i = 0; i < 4; i++) {
				System.out.println(teachers[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("doEx1�����д��������±�Խ���쳣��");
			throw e;//�ٴ��׳��������±�Խ���쳣
		}
	}
	public static void main(String[] args) {
//		try {
			doEx1();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			System.out.println("main�����д��������±�Խ���쳣��");
//		}finally{
//			System.out.println("���������");
//		}
	}
}
