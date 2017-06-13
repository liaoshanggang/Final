package com.ch2.test2_14;

public class TestQuick {
	//����һ������arrayΪ�������飬i��jΪ������ʼ�ͽ���λ�ã����عؼ��������������
	public static int sortUnit(int[] array,int i,int j){
		int key = array[i];
		while(i<j){
			//�Ӻ���ǰ������keyС��ֵ����keyС�ķ����
			while(j>i&&array[j]>=key){
				j--;
			}
			array[i] = array[j];
			//��ǰ���������key���ֵ����key��ķ��ұ�
			while(j>i&&array[i]<=key){
				i++;
			}
			array[j] = array[i];
		}
		//��i=jʱ��һ���������
		array[j] = key;
		//���عؼ���������������
		return j;
	}
	//�������򣬵ݹ����
	public static void sort(int[]array,int low,int high){
		if(low>=high){
			return ;
		}
		//���һ������
		int index = sortUnit(array, low, high);
		//����߲��ֽ�������
		sort(array, low, index-1);
		//���ұ߲��ֽ�������
		sort(array, index+1, high);
	}
	
	public static void main(String[] args) {
		int[] array = {23,234,124,435,61,43,657,21};
		System.out.println("����ǰ�����飺");
		show(array);
		sort(array, 0, array.length-1);
		System.out.println("���������飺");
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
