package com.ch5.test5_14;

import java.lang.reflect.Array;

public class TestArray2 {
	public static void main(String[] args) {
		Class c = Integer.TYPE;
		//����һ��8*10��ά��������
		int dim[] = {8,10};
		Object arr = Array.newInstance(c, dim);
		//arr4Ϊһά����
		Object arr4 = Array.get(arr, 4);
		//��arr[4][6]��ֵΪ20
		Array.set(arr4, 6, 20);
		//��ȡarr[4][6]��ֵ
		System.out.println("arr[4][6]]��ֵΪ��"+Array.get(arr4, 6));
	}
}
