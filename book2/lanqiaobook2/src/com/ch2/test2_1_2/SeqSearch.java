package com.ch2.test2_1_2;

/**
 * ����һ��Ҫ���������������ڸ������������Ƿ���ڣ����ڷ����±�ֵ���������򷵻�-1��
 * @author gg
 *
 */
public class SeqSearch {
	public static int seqSeach(int[] a,int elem){
		int n = a.length;//ѭ������
		int i = 0;//ѭ������
		while(i<n&&a[i]!=elem){
			i++;//����ȶԣ�����ͬ�������±�����1
		}
		//�˳�ѭ����2��������ҵ���û�ҵ���������ȶԶ�û�ҵ�
		//�����±����������鳤�������û�鵽ָ��������Ԫ��
		if(i==n){
			return -1;
		}else{
			return i+1;//��ʾ�ҵ��������������еĵ�i+1��Ԫ��
		}
	}
	public static void main(String[] args) {
		int test[] = {213,322,432,232,2,123,45,13,122,675,87};
		int elem = 122;
		int res = seqSeach(test, elem);
		if(res!=-1){
			System.out.println("���ҳɹ�!��Ԫ��������������Ϊ��"+res+"��Ԫ��");
		}else{
			System.out.println("����ʧ�ܣ���Ԫ���ڸ������в�����");
		}
	}
}
