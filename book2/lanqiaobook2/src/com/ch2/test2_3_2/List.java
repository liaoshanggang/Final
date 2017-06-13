package com.ch2.test2_3_2;

public interface List {
	//指定下标位置插入数据元素
	public abstract void  insert(int i,Object obj) throws Exception;
	//删除指定下标位置的数据元素
	public abstract Object delete(int i)throws Exception;
	//替换指定下标位置的数据元素
	public abstract void update(int i,Object obj)throws Exception;
	//获取指定下标位置的数据元素
	public abstract Object getData(int i)throws Exception;
	//获取线性表的数据元素个数
	public abstract int size();
	//判断线性表是否为空
	public abstract boolean isEmpty();
}
