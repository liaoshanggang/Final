package com.ch2.test2_8_1;

/**
 * 给定一个数组，把这个数组中的元素排列，用选择排序实现
 * @author gg
 *
 */
public class TestSelect {
	public static void selectSort(int[] a){
		for (int i = 0; i < a.length-1; i++) {
			int current = i;//记录每次要比较和比较后存放的下标
			//选择待排序数列中最小数的下标
			for (int j = i; j < a.length; j++) {
				if(a[j]<a[current]){
					current = j;
				}
			}
			//表明current没有改变的话就不用交换
			if(current!=i){
				int temp = a[current];
				a[current] = a[i];
				a[i] = temp;
			}
		}
	}
	public static void show(int[] array){
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i!=array.length-1){
				System.out.print(" ");
			}	
		}
		System.out.println("}");
	}
	public static void main(String[] args) {
		int array[] = {23,234,231,21,342};
		System.out.println("排序前的数组：");
		show(array);
		selectSort(array);
		show(array);
	}
}
