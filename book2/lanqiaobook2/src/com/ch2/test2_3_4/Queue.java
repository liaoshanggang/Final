package com.ch2.test2_3_4;

public interface Queue {
	//������Ԫ�ز������β�������������
	public abstract void enQueue(Object obj)throws Exception;
	//��ȡ��ɾ������ͷ������Ԫ�ء�����������
	public abstract Object deQueue()throws Exception;
	//��ȡ����ɾ������ͷ������Ԫ��
	public abstract Object getFront()throws Exception;
	//�ж϶����Ƿ�Ϊ��
	public abstract boolean isEmpty();
}
