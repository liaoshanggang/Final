package com.ch2.test2_3_3;

public interface Stack {
	//������Ԫ��ѹ��ջ�С�������ѹջ
	public abstract void push(Object obj)throws Exception;
	//��ȡ��ɾ��ջ������Ԫ�ء���������ջ
	public abstract Object pop()throws Exception;
	//��ȡ����ɾ��ջ������Ԫ��
	public abstract Object getTop()throws Exception;
	//�ж�ջ�Ƿ�Ϊ��
	public abstract boolean isEmpty()throws Exception;
}
