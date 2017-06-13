package com.ch3.test3_11;

import java.util.Arrays;

public class TestArrays {
	public static void output(int[] a){
		for (int elem : a) {
			System.out.print(elem+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] array = new int[5];
		//填充数组
		Arrays.fill(array, 8);
		System.out.println("填充数组Arrays.fill(array,8):");
		TestArrays.output(array);
		//将数组索引为1到4的元素赋值为6
		Arrays.fill(array, 1,4,6);
		System.out.println("将数组索引为1到4的元素赋值为6Arrays.fill(array,1,4,6):");
		TestArrays.output(array);
		int[] array1 = {12,3,34,323,21,234,21,1,2,3,24,45,445};
		System.out.println("排序前，数组的序列为：");
		TestArrays.output(array1);
		Arrays.sort(array1,2,8);
		System.out.println("对数组索引为2到8的元素进行排序：Array.sort(array,2,8)");
		TestArrays.output(array1);
		Arrays.sort(array1);
		System.out.println("对数组进行自然排序：Arrays.sort(array1):");
		TestArrays.output(array1);
		//比较数字元素是否相等
		int[] array2 = array1.clone();
		System.out.println("数组克隆后是否相等：Arrays.equals(array1,array2):"
		+Arrays.equals(array1, array2));
		//使用二分查找发查找元素下标（数组必须是排序好的）
		System.out.println("45在数组中的索引：Arrays.binarySearch(array1,45):"+
		Arrays.binarySearch(array1, 45));
	}
}
