package com.ch3.test3_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		//����һ��HashSet����,���ѧ��������Ϣ
		Set nameSet = new HashSet();
		nameSet.add("����");
		nameSet.add("������");
		nameSet.add("��ά˹");
		nameSet.add("˼ά");
		System.out.println("�ٴ���������Ƿ�ɹ���"+nameSet.add("����"));
		System.out.println("�ٴ����˼ά�Ƿ�ɹ���"+nameSet.add("˼ά"));
		System.out.println("��ʾ�������ݣ�"+nameSet);
		System.out.println("�������Ƿ����˼ά��"+nameSet.contains("˼ά"));
		System.out.println("�Ӽ�����ɾ��\"˼ά\"...");
		System.out.println("����ɾ��˼ά��"+nameSet.remove("˼ά"));
		System.out.println("�������Ƿ����˼ά��"+nameSet.contains("˼ά"));
		System.out.println("��ʾ�������ݣ�"+nameSet);
		System.out.println("������Ԫ�صĸ�����"+nameSet.size());
//		System.out.println("������ռ���Ԫ��....");
//		nameSet.clear();
//		System.out.println("�����Ƿ���գ�"+nameSet.isEmpty());
		System.out.println("��ʾ�������ݣ�"+nameSet);
		System.out.println("ʹ��toArray:");
		Object[] obj = nameSet.toArray();
		System.out.println(obj.length);
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].hashCode()+obj[i].toString()+obj[i].getClass());
		}
		Iterator it = nameSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		nameSet.add(121);
		nameSet.add(23.324);
		nameSet.add(true);
		nameSet.add(nameSet);
		nameSet.add(23f);
		nameSet.add('1');
		nameSet.add(obj);
		System.out.println("��ʾ����"+nameSet);
		
	}
}
