package com.ch2.test2_14;

public class TestQuick {
	//进行一轮排序，array为排序数组，i，j为排序起始和结束位置，返回关键数据排序后索引
	public static int sortUnit(int[] array,int i,int j){
		int key = array[i];
		while(i<j){
			//从后向前搜索比key小的值，比key小的放左边
			while(j>i&&array[j]>=key){
				j--;
			}
			array[i] = array[j];
			//从前向后搜索比key大的值，比key大的放右边
			while(j>i&&array[i]<=key){
				i++;
			}
			array[j] = array[i];
		}
		//当i=j时，一轮排序结束
		array[j] = key;
		//返回关键数据排序后的索引
		return j;
	}
	//快速排序，递归调用
	public static void sort(int[]array,int low,int high){
		if(low>=high){
			return ;
		}
		//完成一轮排序
		int index = sortUnit(array, low, high);
		//对左边部分进行排序
		sort(array, low, index-1);
		//对右边部分进行排序
		sort(array, index+1, high);
	}
	
	public static void main(String[] args) {
		int[] array = {23,234,124,435,61,43,657,21};
		System.out.println("排序前的数组：");
		show(array);
		sort(array, 0, array.length-1);
		System.out.println("排序后的数组：");
		show(array);
	}
	public static void show(int[] array){
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("}");
	}
}
