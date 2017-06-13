package com.ch2.test2_3_2;

import java.util.Scanner;

//数组实现的线性表类
public class SeqList implements List {
	//默认线性表的长度
	final int defaultsize = 10;
	//线性表的长度
	int maxSize;
	//线性表中现有的元素个数
	int curCount;
	//用对象数组存储线性表
	Object[] listArray;
	//判断是否插入成功
	boolean flag = false;
	//无参构造方法
	SeqList() {
		// TODO 自动生成的构造函数存根
		initiate(defaultsize);
	}
	//有参构造方法
	SeqList(int cursize){
		initiate(cursize);
	}
	//初始化方法，设置线性表长度、现有元素个数和初始化对象数组（用线性表长度）
	public void initiate(int sz){
		maxSize = sz;
		curCount = 0;
		listArray = new Object[sz];
	}
	
	//实现在指定下标位置插入元素
	@Override
	public void insert(int i, Object obj) throws Exception {
		// TODO 自动生成的方法存根
		//1、判断线性表是否已满
		if(curCount==maxSize){
			flag = false;
			throw new Exception("线性表已满，无法插入！");
		}
		//2、判断角标插入的位置是否正确
		//只允许在现有线性表数据元素之前或之后插入，不允许隔着一个空位置之后插入数据元素
		//插入的位置只要不大于当前元素个数就符合规则
		if(i>curCount){
			flag = false;
			throw new Exception("插入下标位置错误！");
		}
		//3、将插入位置后的数据元素，j=curCount保证不越界
		//其实就是从最后一个元素往后移
		for (int j = curCount; j >i; j--) {
			listArray[j] = listArray[j-1];	
		}
		//4、插入数据元素，并增加线性表中现有元素个数
		listArray[i] = obj;
		System.out.println("插入成功");
		flag = true;
		curCount++;
	}

	//实现删除指定下标位置的数据元素，并返回删除的元素
	@Override
	public Object delete(int i) throws Exception {
		// TODO 自动生成的方法存根
		//1、判断线性表是否为空
		if(curCount==0){
			throw new Exception("线性表已空，无法删除！");
		}
		//2、判断删除的下表位置是否正确
		if(i>curCount-1){
			throw new Exception("删除下表位置错误！");
		}
		//3、得被删除的数据元素
		Object it = listArray[i];
		//4、将删除位置后的数据元素全部前移
		for (int j = i; j < curCount-1; j++) {
			listArray[j] = listArray[j+1];
		}
		//5、返回被删除数据元素，并减少线性表中现有元素个数
		curCount--;
		System.out.println("删除成功！");
		return it;
	}
	
	//实现替换指定下标位置的数据元素
	@Override
	public void update(int i,Object obj) throws Exception {
		// TODO 自动生成的方法存根
		//1、判断线性表是否空
		if(curCount==0){
			throw new Exception("线性表已空，无法替换！");
		}
		//2、判断替换的位置是否正确
		if(i>curCount){
			throw new Exception("替换的下标位置错误！");
		}
		//3、替换指定下标的数据元素
		listArray[i] = obj;
	}
	
	//实现获取指定下标位置的数据元素
	@Override
	public Object getData(int i) throws Exception {
		// TODO 自动生成的方法存根
		//1、判断线性表是否空
		if(curCount==0){
			throw new Exception("线性表已空，无法获取！");
		}
		//2、判断获取的下标位置是否正确
		if(i>curCount){
			throw new Exception("获取的下标位置错误！");
		}
		//3、获取元素
		return listArray[i];
	}

	@Override
	public int size() {
		// TODO 自动生成的方法存根
		return curCount;
	}

	@Override
	public  boolean isEmpty() {
		// TODO 自动生成的方法存根
		return curCount==0;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SeqList seqList = new SeqList(5);
		int j = 0;
			while(true){
				
				seqList.show();
				System.out.println("请输入插入的位置：");
				int i = in.nextInt();
				try {
					seqList.insert(i, "2"+(j++));
					
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
					if(seqList.flag==false){
						break;
					}
				}
			}
			while(true){
				System.out.println("请输入删除的位置：");
				int k = in.nextInt();
				try {
					System.out.println(seqList.delete(k));
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			
			
	}
	
	public void show(){
		System.out.println("线性表的默认长度："+getDefaultsize());
		System.out.println("线性表的长度："+getMaxSize());
		System.out.println("当前元素个数："+getCurCount());
		System.out.println("线性表元素：");
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
