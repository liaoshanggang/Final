package com.ch2.test2_8_1;

/**
 * ����һ�����飬����������е�Ԫ�����У���ѡ������ʵ��
 * @author gg
 *
 */
public class TestSelect {
	public static void selectSort(int[] a){
		for (int i = 0; i < a.length-1; i++) {
			int current = i;//��¼ÿ��Ҫ�ȽϺͱȽϺ��ŵ��±�
			//ѡ���������������С�����±�
			for (int j = i; j < a.length; j++) {
				if(a[j]<a[current]){
					current = j;
				}
			}
			//����currentû�иı�Ļ��Ͳ��ý���
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
		System.out.println("����ǰ�����飺");
		show(array);
		selectSort(array);
		show(array);
	}
}
