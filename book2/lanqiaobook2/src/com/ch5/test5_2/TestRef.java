package com.ch5.test5_2;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ����������ʱҪ���û�����һ��Java��ȫ����Ȼ����Ҫ�����г����Java������з���������ΰ��أ�
 * @author gg
 *
 */
public class TestRef {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ��Java��ȫ����");
		String cName = in.next();
		showMethods(cName);
	}

	private static void showMethods(String cName) {
		// TODO �Զ����ɵķ������
		try {
			Class c;
			c = Class.forName(cName);
			Method m[] = c.getDeclaredMethods();
			System.out.println("��Java��ķ����У�");
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i].toString());
				
			}
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
}
