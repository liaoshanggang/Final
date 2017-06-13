package com.ch5.test5_11;

import java.lang.reflect.Constructor;

public class TestNewInstance1 {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.ch5.test5_11.Super");
			//����һ��ָ�������б�int.class,int.class����Constructor����
			Constructor con =  c.getDeclaredConstructor(new Class[]{int.class,int.class});
			//ͨ��Constructor��newInstance(Object[] args)�����������󣬲���Ϊ�����б�
			//�����б�Ի�����������֧���Զ�װ����䣬����Ҳ����д��newInstance(21,23)
			Super sup = (Super) con.newInstance(new Object[]{21,22});
			System.out.println(sup.supPackage());
			//����һ���޲ε�Constructor����
			Constructor con2 = c.getDeclaredConstructor();
			Super sup2 = (Super) con2.newInstance();
			System.out.println(sup2.supPac);
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
