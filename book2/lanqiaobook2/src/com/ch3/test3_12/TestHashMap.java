package com.ch3.test3_12;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		Map domains = new HashMap();
		domains.put("com", "工商企业");
		domains.put("org", "非盈利组织");
		domains.put("net", "网络服务商");
		domains.put("edu", "教育机构");
		domains.put("gov", "政府部门");
		String op = (String) domains.get("com");
		System.out.println("com国际域名对应的含义为："+op);
		//判断是否包含某个建
		System.out.println("domains键值对集合中是否包含gov:"+domains.containsKey("gov"));
		//删除键值对
		domains.remove("gov");
		System.out.println("删除后集合中是否包含gov:"+domains.containsKey("gov"));
		//输出全部键值对
		System.out.println(domains);
		System.out.println(domains.keySet());
		System.out.println(domains.values());
		System.out.println(domains.containsValue("工商企业"));
		domains.put("sdf", "工商企业");
		System.out.println(domains.containsValue("工商企业"));
		System.out.println(domains.size()+"个");
	}
}
