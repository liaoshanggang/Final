package com.ch5.test5_14;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(System.in);
			Class c = Class.forName("java.lang.String");
			System.out.println("������༶������");
			int stuNum = in.nextInt();
			//��������ΪstuNum���ַ�������
			Object arr = Array.newInstance(c, stuNum);
			System.out.println("��������Ҫ��ѧ��Ϊ����ѧ������������");
			int stuNo = in.nextInt();
			System.out.println("�������ѧ��������");
			String stuName = in.next();
			//ʹ��Array���set���������鸳ֵ
			Array.set(arr, (stuNo-1), stuName);
			//ʹ��Array��get������ȡԪ�ص�ֵ
			System.out.println("ѧ��Ϊ"+stuNo+"��ѧ������Ϊ��"+Array.get(arr, stuNo-1));
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch��
			e.printStackTrace();
		}
	}
}
