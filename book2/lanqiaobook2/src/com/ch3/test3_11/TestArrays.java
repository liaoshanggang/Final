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
		//�������
		Arrays.fill(array, 8);
		System.out.println("�������Arrays.fill(array,8):");
		TestArrays.output(array);
		//����������Ϊ1��4��Ԫ�ظ�ֵΪ6
		Arrays.fill(array, 1,4,6);
		System.out.println("����������Ϊ1��4��Ԫ�ظ�ֵΪ6Arrays.fill(array,1,4,6):");
		TestArrays.output(array);
		int[] array1 = {12,3,34,323,21,234,21,1,2,3,24,45,445};
		System.out.println("����ǰ�����������Ϊ��");
		TestArrays.output(array1);
		Arrays.sort(array1,2,8);
		System.out.println("����������Ϊ2��8��Ԫ�ؽ�������Array.sort(array,2,8)");
		TestArrays.output(array1);
		Arrays.sort(array1);
		System.out.println("�����������Ȼ����Arrays.sort(array1):");
		TestArrays.output(array1);
		//�Ƚ�����Ԫ���Ƿ����
		int[] array2 = array1.clone();
		System.out.println("�����¡���Ƿ���ȣ�Arrays.equals(array1,array2):"
		+Arrays.equals(array1, array2));
		//ʹ�ö��ֲ��ҷ�����Ԫ���±꣨�������������õģ�
		System.out.println("45�������е�������Arrays.binarySearch(array1,45):"+
		Arrays.binarySearch(array1, 45));
	}
}
