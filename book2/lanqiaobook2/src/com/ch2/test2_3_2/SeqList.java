package com.ch2.test2_3_2;

import java.util.Scanner;

//����ʵ�ֵ����Ա���
public class SeqList implements List {
	//Ĭ�����Ա�ĳ���
	final int defaultsize = 10;
	//���Ա�ĳ���
	int maxSize;
	//���Ա������е�Ԫ�ظ���
	int curCount;
	//�ö�������洢���Ա�
	Object[] listArray;
	//�ж��Ƿ����ɹ�
	boolean flag = false;
	//�޲ι��췽��
	SeqList() {
		// TODO �Զ����ɵĹ��캯�����
		initiate(defaultsize);
	}
	//�вι��췽��
	SeqList(int cursize){
		initiate(cursize);
	}
	//��ʼ���������������Ա��ȡ�����Ԫ�ظ����ͳ�ʼ���������飨�����Ա��ȣ�
	public void initiate(int sz){
		maxSize = sz;
		curCount = 0;
		listArray = new Object[sz];
	}
	
	//ʵ����ָ���±�λ�ò���Ԫ��
	@Override
	public void insert(int i, Object obj) throws Exception {
		// TODO �Զ����ɵķ������
		//1���ж����Ա��Ƿ�����
		if(curCount==maxSize){
			flag = false;
			throw new Exception("���Ա��������޷����룡");
		}
		//2���жϽǱ�����λ���Ƿ���ȷ
		//ֻ�������������Ա�����Ԫ��֮ǰ��֮����룬���������һ����λ��֮���������Ԫ��
		//�����λ��ֻҪ�����ڵ�ǰԪ�ظ����ͷ��Ϲ���
		if(i>curCount){
			flag = false;
			throw new Exception("�����±�λ�ô���");
		}
		//3��������λ�ú������Ԫ�أ�j=curCount��֤��Խ��
		//��ʵ���Ǵ����һ��Ԫ��������
		for (int j = curCount; j >i; j--) {
			listArray[j] = listArray[j-1];	
		}
		//4����������Ԫ�أ����������Ա�������Ԫ�ظ���
		listArray[i] = obj;
		System.out.println("����ɹ�");
		flag = true;
		curCount++;
	}

	//ʵ��ɾ��ָ���±�λ�õ�����Ԫ�أ�������ɾ����Ԫ��
	@Override
	public Object delete(int i) throws Exception {
		// TODO �Զ����ɵķ������
		//1���ж����Ա��Ƿ�Ϊ��
		if(curCount==0){
			throw new Exception("���Ա��ѿգ��޷�ɾ����");
		}
		//2���ж�ɾ�����±�λ���Ƿ���ȷ
		if(i>curCount-1){
			throw new Exception("ɾ���±�λ�ô���");
		}
		//3���ñ�ɾ��������Ԫ��
		Object it = listArray[i];
		//4����ɾ��λ�ú������Ԫ��ȫ��ǰ��
		for (int j = i; j < curCount-1; j++) {
			listArray[j] = listArray[j+1];
		}
		//5�����ر�ɾ������Ԫ�أ����������Ա�������Ԫ�ظ���
		curCount--;
		System.out.println("ɾ���ɹ���");
		return it;
	}
	
	//ʵ���滻ָ���±�λ�õ�����Ԫ��
	@Override
	public void update(int i,Object obj) throws Exception {
		// TODO �Զ����ɵķ������
		//1���ж����Ա��Ƿ��
		if(curCount==0){
			throw new Exception("���Ա��ѿգ��޷��滻��");
		}
		//2���ж��滻��λ���Ƿ���ȷ
		if(i>curCount){
			throw new Exception("�滻���±�λ�ô���");
		}
		//3���滻ָ���±������Ԫ��
		listArray[i] = obj;
	}
	
	//ʵ�ֻ�ȡָ���±�λ�õ�����Ԫ��
	@Override
	public Object getData(int i) throws Exception {
		// TODO �Զ����ɵķ������
		//1���ж����Ա��Ƿ��
		if(curCount==0){
			throw new Exception("���Ա��ѿգ��޷���ȡ��");
		}
		//2���жϻ�ȡ���±�λ���Ƿ���ȷ
		if(i>curCount){
			throw new Exception("��ȡ���±�λ�ô���");
		}
		//3����ȡԪ��
		return listArray[i];
	}

	@Override
	public int size() {
		// TODO �Զ����ɵķ������
		return curCount;
	}

	@Override
	public  boolean isEmpty() {
		// TODO �Զ����ɵķ������
		return curCount==0;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SeqList seqList = new SeqList(5);
		int j = 0;
			while(true){
				
				seqList.show();
				System.out.println("����������λ�ã�");
				int i = in.nextInt();
				try {
					seqList.insert(i, "2"+(j++));
					
				} catch (Exception e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
					if(seqList.flag==false){
						break;
					}
				}
			}
			while(true){
				System.out.println("������ɾ����λ�ã�");
				int k = in.nextInt();
				try {
					System.out.println(seqList.delete(k));
				} catch (Exception e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			
			
	}
	
	public void show(){
		System.out.println("���Ա��Ĭ�ϳ��ȣ�"+getDefaultsize());
		System.out.println("���Ա�ĳ��ȣ�"+getMaxSize());
		System.out.println("��ǰԪ�ظ�����"+getCurCount());
		System.out.println("���Ա�Ԫ�أ�");
		for (int i = 0; i < getListArray().length; i++) {
			System.out.print(listArray[i]+" ");
		}
	}
	public int getDefaultsize() {
		return defaultsize;
	}
	public int getMaxSize() {
		return maxSize;
	}
	public int getCurCount() {
		return curCount;
	}
	public Object[] getListArray() {
		return listArray;
	}
	
	
}
