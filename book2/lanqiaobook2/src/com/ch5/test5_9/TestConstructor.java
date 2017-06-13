package com.ch5.test5_9;

import java.lang.reflect.Constructor;

public class TestConstructor {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.ch5.test5_9.Sub");
			//����Constructor�������飬��Ÿ����ӿڵ����й��췽��
//			Constructor clist[] = c.getDeclaredConstructors();
			//����Constructor�������飬��Ÿ����ӿڵ����й��й��췽��
			Constructor clist[] = c.getConstructors();
			System.out.println("Sub��getDeclaredConstructors()�õ��Ĺ��췽�����£�");
			int i = 0;
			//�������й��췽��
			for (Constructor con : clist) {
				System.out.println("**************************************");
				System.out.println("���췽��"+(i+1)+"����Ϊ��"+con.getName());
				System.out.println("�ù��췽�����ڵ����ӿ�Ϊ��"+con.getDeclaringClass());
				//����Class�������飬��ʾConstructor��������ʾ�Ĺ��췽�����β�����
				Class ptl[] = con.getParameterTypes();
				for (int j = 0; j < ptl.length; j++) {
					System.out.println("�β�"+(j+1)+"����Ϊ��"+ptl[j]);
				}
				//����Class�������飬��ʾConstructor��������ʾ�ķ������쳣�б�
				Class et1[] = con.getExceptionTypes();
				for (int j = 0; j < et1.length; j++) {
					System.out.println("�쳣"+(j+1)+"����Ϊ��"+et1[j]);
				}
				i++;
			}
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
}
