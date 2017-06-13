package com.ch3.test3_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("w");
		list.add("o");
		list.add("r");
		list.add("l");
		list.add("d");
		System.out.println("����ǰ��                                           "+list);
		System.out.println("�ü����е����ֵ��                        "+Collections.max(list));
		System.out.println("�ü����е���Сֵ��                        "+Collections.min(list));
		Collections.sort(list);
		System.out.println("�����                                           "+list);
		//ʹ�ö��ֲ��ң�����ǰ�뱣֤�����Ҽ�������Ȼ�������е�
		System.out.println("r�ڼ����е�����Ϊ��                      "+Collections.binarySearch(list, "r"));
		//�������
		Collections.shuffle(list);
		System.out.println("��shuffle�����                     "+list);
		Collections.reverse(list);
		System.out.println("��reverse�����                     "+list);
		Collections.swap(list, 0, 4);
		System.out.println("����Ϊ0��4��Ԫ�ؽ�����             "+list);
		Collections.replaceAll(list, "w", "j");
		System.out.println("��w�滻��j��Ľ����                     "+list);
		Collections.fill(list, "qwe");
		System.out.println("ȫ�����Ϊqwe��Ľ����               "+list);
		
	}
}
