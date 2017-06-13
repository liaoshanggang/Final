package com.ch2.test2_3_3;

public class SeqStack implements Stack {
	
	final int defaultsize = 10;
	int top;//标记栈内元素个数，即栈顶元素
	Object stack[];
	int maxsize;
	
	public SeqStack() {
		// TODO 自动生成的构造函数存根
		initiate(defaultsize);
	}

	public SeqStack(int sz){
		initiate(sz);
	}
	
	private void initiate(int sz) {
		// TODO 自动生成的方法存根
		maxsize = sz;
		top = 0;
		stack = new Object[sz];
	}
	
	
	@Override
	public void push(Object obj) throws Exception {
		// TODO 自动生成的方法存根
		//1、判断堆栈是否已满
		if(top==maxsize){
			throw new Exception("线性栈已满，无法入栈！");
		}
		
		//2、入栈并把指针加1
		stack[top] = obj;
		top++;//其实就是指向上一个的空间，以便下次入栈
	}

	@Override
	public Object pop() throws Exception {
		// TODO 自动生成的方法存根
		//1、判断堆栈是否为空
		if(top==0){
			throw new Exception("堆栈已空，无法出栈！");
		}
		top--;
		return stack[top];
	}

	@Override
	public Object getTop() throws Exception {
		// TODO 自动生成的方法存根
		if(top==0){
			throw new Exception("堆栈已空，无法获取！");
		}
		return stack[top-1];
	}

	@Override
	public boolean isEmpty() throws Exception {
		// TODO 自动生成的方法存根
		return (top>0);
	}

}
