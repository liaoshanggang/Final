package com.ch2.test2_3_3;

public interface Stack {
	//把数据元素压入栈中————压栈
	public abstract void push(Object obj)throws Exception;
	//获取并删除栈顶数据元素————退栈
	public abstract Object pop()throws Exception;
	//获取但不删除栈顶数据元素
	public abstract Object getTop()throws Exception;
	//判断栈是否为空
	public abstract boolean isEmpty()throws Exception;
}
