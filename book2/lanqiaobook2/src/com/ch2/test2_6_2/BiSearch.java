package com.ch2.test2_6_2;

/**
 * ����Ҫ���һ������������н��ж��ֲ��ң�����鵽���ؼ�¼ֵ���±꣬���򷵻�-1����ʾû�鵽��
 * ���ֲ��ң�
 * ���ݽṹ�е�Ԫ���ǰ��������еģ������ݽṹ�м�λ�ü�¼��������Ҫ�������ݽ��бȽϣ����������ȣ�����ҳɹ���
 * ���������м�λ�ü�¼�����ݽṹ�ֳ�ǰ�������������ݽṹ�����Ҫ��������С���м�λ�ü�¼�����ݣ�
 * ���һ������ǰһ�����ݽṹ�������һ�����Һ�һ�������ݽṹ���ظ����Ϲ��̡�����
 * @author gg
 *
 */
public class BiSearch {
	public static int biSearch(int[]a,int elem){
		int high = a.length - 1;//��λ�±�
		int low = 0;//��λ�±�
		int mid;//�м�λ�±�
		while(low<=high){
			mid = (high + low)/2;
			if(elem==a[mid]){
				return mid+1;//��ʾΪҪ���ҵ����ڸ����������е�mid+1��,��Ϊ�����0��ʼ����
			}else if(elem < a[mid]){
				high = mid-1;//��Ϊ�м�λ�ö���Ҫ�����С������Ҫ-1�����ð��ѱȵ����ٱ�
			}else{
				low = mid+1;//��Ϊ�м�λ�ö���Ҫ�����������Ҫ��1�����ð��ѱȵ����ٱ�
			}
		}
		//����˳�ѭ����˵���������˶�û�в鵽
		return -1;
	}
	public static void main(String[] args) {
		int[] test = {23,33,34,45,56,67,78,89,109};
		int elem = 67;
		System.out.println("����������Ϊ��");
		System.out.print("{");
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i]+" ");
		}
		System.out.println("}");
		System.out.println("Ҫ�����Ϊ��"+elem);
		int res = biSearch(test, elem);
		if(res!=-1){
			System.out.println("���ҳɹ�����Ԫ��Ϊ��"+res+"��Ԫ��");
		}else{
			System.out.println("����ʧ�ܣ���Ԫ�����������в�����");			
		}
	}
}
