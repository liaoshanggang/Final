package com.ch3.test3_12;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		Map domains = new HashMap();
		domains.put("com", "������ҵ");
		domains.put("org", "��ӯ����֯");
		domains.put("net", "���������");
		domains.put("edu", "��������");
		domains.put("gov", "��������");
		String op = (String) domains.get("com");
		System.out.println("com����������Ӧ�ĺ���Ϊ��"+op);
		//�ж��Ƿ����ĳ����
		System.out.println("domains��ֵ�Լ������Ƿ����gov:"+domains.containsKey("gov"));
		//ɾ����ֵ��
		domains.remove("gov");
		System.out.println("ɾ���󼯺����Ƿ����gov:"+domains.containsKey("gov"));
		//���ȫ����ֵ��
		System.out.println(domains);
		System.out.println(domains.keySet());
		System.out.println(domains.values());
		System.out.println(domains.containsValue("������ҵ"));
		domains.put("sdf", "������ҵ");
		System.out.println(domains.containsValue("������ҵ"));
		System.out.println(domains.size()+"��");
	}
}
