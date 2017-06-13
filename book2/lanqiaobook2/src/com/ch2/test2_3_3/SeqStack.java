package com.ch2.test2_3_3;

public class SeqStack implements Stack {
	
	final int defaultsize = 10;
	int top;//���ջ��Ԫ�ظ�������ջ��Ԫ��
	Object stack[];
	int maxsize;
	
	public SeqStack() {
		// TODO �Զ����ɵĹ��캯�����
		initiate(defaultsize);
	}

	public SeqStack(int sz){
		initiate(sz);
	}
	
	private void initiate(int sz) {
		// TODO �Զ����ɵķ������
		maxsize = sz;
		top = 0;
		stack = new Object[sz];
	}
	
	
	@Override
	public void push(Object obj) throws Exception {
		// TODO �Զ����ɵķ������
		//1���ж϶�ջ�Ƿ�����
		if(top==maxsize){
			throw new Exception("����ջ�������޷���ջ��");
		}
		
		//2����ջ����ָ���1
		stack[top] = obj;
		top++;//��ʵ����ָ����һ���Ŀռ䣬�Ա��´���ջ
	}

	@Override
	public Object pop() throws Exception {
		// TODO �Զ����ɵķ������
		//1���ж϶�ջ�Ƿ�Ϊ��
		if(top==0){
			throw new Exception("��ջ�ѿգ��޷���ջ��");
		}
		top--;
		return stack[top];
	}

	@Override
	public Object getTop() throws Exception {
		// TODO �Զ����ɵķ������
		if(top==0){
			throw new Exception("��ջ�ѿգ��޷���ȡ��");
		}
		return stack[top-1];
	}

	@Override
	public boolean isEmpty() throws Exception {
		// TODO �Զ����ɵķ������
		return (top>0);
	}

}
