package com.ch2.test2_3_2;

public interface List {
	//ָ���±�λ�ò�������Ԫ��
	public abstract void  insert(int i,Object obj) throws Exception;
	//ɾ��ָ���±�λ�õ�����Ԫ��
	public abstract Object delete(int i)throws Exception;
	//�滻ָ���±�λ�õ�����Ԫ��
	public abstract void update(int i,Object obj)throws Exception;
	//��ȡָ���±�λ�õ�����Ԫ��
	public abstract Object getData(int i)throws Exception;
	//��ȡ���Ա������Ԫ�ظ���
	public abstract int size();
	//�ж����Ա��Ƿ�Ϊ��
	public abstract boolean isEmpty();
}
