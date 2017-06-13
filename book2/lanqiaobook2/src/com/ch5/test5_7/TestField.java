package com.ch5.test5_7;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class TestField {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.ch5.test5_5.Sub");
			Scanner in = new Scanner(System.in);
			System.out.println("���������ȡSub����ĸ����Ե����ͣ�");
			String name = in.next();
			//ͨ��ָ����������ȡ���Զ���
			Field sf = c.getDeclaredField(name);
			//�õ���������
			System.out.println("Sub��"+name+"���Ե�����Ϊ��"+sf.getType());
			System.out.println("************************************");
			//����Filed�������飬��Ÿ����ӿڵ��������ԣ������̳еģ�
//			Field flist[] = c.getDeclaredFields();
			Field flist[] = c.getFields();
			System.out.println("Sub��getDeclaredFileds()�õ�����������");
			for (int i = 0; i < flist.length; i++) {
				System.out.println("**********************************");
				Field field = flist[i];
				//�õ�������
				System.out.println("����"+(i+1)+"����Ϊ��"+field.getName());
				System.out.println("���������ڵ����ӿ�Ϊ��"+field.getClass());
				System.out.println("�����Ե�����Ϊ��"+field.getType());
				//��������ʽ�����ɴ�Field�����ʾ�����Ե�Java����Ȩ�����η�
				int m = field.getModifiers();
				System.out.println("�����Ե����η�Ϊ��"+Modifier.toString(m));
			}
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
