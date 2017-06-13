package com.ch5.test5_12;

import java.lang.reflect.Field;

import com.ch5.test5_11.Super;

public class TestChangeField {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.ch5.test5_11.Super");
			Super sup = (Super) c.newInstance();
			//ͨ�����������Field����
			Field f = c.getDeclaredField("supPri");
			//ȡ�����Եķ���Ȩ�޿��ƣ���ʹprivate����Ҳ���Խ��з���
			f.setAccessible(true);
			//����get(Object o)����ȡ�ö���o��Ӧ����ֵ
			System.out.println("ȡ������Ȩ�޿��ƺ����supPri,��ֵΪ��"+f.get(sup));
			//����set(Object o,Object v)�������ö����Ӧ����ֵ
			f.set(sup, 20);
			System.out.println("f.set(sup,20)�����supPri,��ֵΪ"+f.get(sup));
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
}
