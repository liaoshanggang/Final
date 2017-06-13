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
		System.out.println("排序前：                                           "+list);
		System.out.println("该集合中的最大值：                        "+Collections.max(list));
		System.out.println("该集合中的最小值：                        "+Collections.min(list));
		Collections.sort(list);
		System.out.println("排序后：                                           "+list);
		//使用二分查找，查找前须保证被查找集合是自然有序排列的
		System.out.println("r在集合中的索引为：                      "+Collections.binarySearch(list, "r"));
		//随机排序
		Collections.shuffle(list);
		System.out.println("再shuffle排序后：                     "+list);
		Collections.reverse(list);
		System.out.println("再reverse排序后：                     "+list);
		Collections.swap(list, 0, 4);
		System.out.println("索引为0、4的元素交换后：             "+list);
		Collections.replaceAll(list, "w", "j");
		System.out.println("把w替换成j后的结果：                     "+list);
		Collections.fill(list, "qwe");
		System.out.println("全部填充为qwe后的结果：               "+list);
		
	}
}
