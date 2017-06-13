package com.ch2.test2_6_2;

/**
 * 需求：要求从一个有序的数组中进行二分查找，如果查到返回记录值的下标，否则返回-1，表示没查到。
 * 二分查找：
 * 数据结构中的元素是按升序排列的，将数据结构中间位置记录的数据与要查找数据进行比较，如果两者相等，则查找成功；
 * 否则利用中间位置记录将数据结构分成前、后两个子数据结构，如果要查找数据小于中间位置记录的数据，
 * 则进一步查找前一个数据结构，否则进一步查找后一个子数据结构。重复以上过程。。。
 * @author gg
 *
 */
public class BiSearch {
	public static int biSearch(int[]a,int elem){
		int high = a.length - 1;//高位下标
		int low = 0;//低位下标
		int mid;//中间位下标
		while(low<=high){
			mid = (high + low)/2;
			if(elem==a[mid]){
				return mid+1;//表示为要查找的数在该有序数组中第mid+1个,因为数组从0开始数数
			}else if(elem < a[mid]){
				high = mid-1;//因为中间位置都比要查的数小，所以要-1，不用把已比的数再比
			}else{
				low = mid+1;//因为中间位置都比要查的数大，所以要加1，不用把已比的数再比
			}
		}
		//如果退出循环，说明遍历完了都没有查到
		return -1;
	}
	public static void main(String[] args) {
		int[] test = {23,33,34,45,56,67,78,89,109};
		int elem = 67;
		System.out.println("该有序数组为：");
		System.out.print("{");
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i]+" ");
		}
		System.out.println("}");
		System.out.println("要查的数为："+elem);
		int res = biSearch(test, elem);
		if(res!=-1){
			System.out.println("查找成功！该元素为第"+res+"个元素");
		}else{
			System.out.println("查找失败！该元素在数据组中不存在");			
		}
	}
}
