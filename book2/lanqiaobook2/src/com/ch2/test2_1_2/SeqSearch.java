package com.ch2.test2_1_2;

/**
 * 给定一个要查的整数，求该数在给定的序列中是否存在，存在返回下标值，不存在则返回-1；
 * @author gg
 *
 */
public class SeqSearch {
	public static int seqSeach(int[] a,int elem){
		int n = a.length;//循环次数
		int i = 0;//循环增量
		while(i<n&&a[i]!=elem){
			i++;//逐个比对，不相同则数组下标数加1
		}
		//退出循环，2个结果，找到或没找到就是逐个比对都没找到
		//数组下标数等于数组长度则表明没查到指定的数据元素
		if(i==n){
			return -1;
		}else{
			return i+1;//表示找到了在无序数组中的第i+1个元素
		}
	}
	public static void main(String[] args) {
		int test[] = {213,322,432,232,2,123,45,13,122,675,87};
		int elem = 122;
		int res = seqSeach(test, elem);
		if(res!=-1){
			System.out.println("查找成功!该元素在无序数组中为第"+res+"个元素");
		}else{
			System.out.println("查找失败！该元素在该数组中不存在");
		}
	}
}
