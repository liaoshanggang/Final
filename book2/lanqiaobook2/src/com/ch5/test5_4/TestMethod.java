package com.ch5.test5_4;

import java.lang.reflect.Method;

public class TestMethod {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("org.w3c.dom.NodeList");
			//����Method�������飬��Ÿ����ӿڵ����з����������̳еģ�
			Method mlist[] = c.getDeclaredMethods();
			System.out.println("NodeList��getDeclaredMethods()�õ��ķ������£�");
			//�������з���
			for (int i = 0; i < mlist.length; i++) {
				System.out.println("*********************************");
				Method method = mlist[i];
				//�õ�������
				System.out.println("����"+(i+1)+"����Ϊ��"+method.getName());
				System.out.println("�÷������ڵ����ӿ�Ϊ��"+method.getDeclaringClass());
				//����Class�������飬��ʾMethod��������ʾ�ķ������β�����
				Class ptl[] = method.getParameterTypes();
				for (int j = 0; j < ptl.length; j++) {
					System.out.println("�β�"+(j+1)+"����Ϊ��"+ptl[j]);
				}
				//����Class�������֣���ʾMethod��������ʾ�ķ������쳣�б�
				Class etl[] = method.getExceptionTypes();
				for (int j = 0; j < etl.length; j++) {
					 System.out.println("�쳣"+(j+1)+"����Ϊ��"+etl[j]);
				}
				System.out.println("����ֵ����Ϊ��"+method.getReturnType());
			}
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
