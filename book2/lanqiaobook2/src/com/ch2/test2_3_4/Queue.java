package com.ch2.test2_3_4;

public interface Queue {
	//把数据元素插入队列尾部————入队
	public abstract void enQueue(Object obj)throws Exception;
	//获取并删除队列头部数据元素————出队
	public abstract Object deQueue()throws Exception;
	//获取但不删除队列头部数据元素
	public abstract Object getFront()throws Exception;
	//判断队列是否为空
	public abstract boolean isEmpty();
}
