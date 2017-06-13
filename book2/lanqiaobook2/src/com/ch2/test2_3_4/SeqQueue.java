package com.ch2.test2_3_4;

public class SeqQueue implements Queue{
	final int defaultsize = 10;
	int front;//队头
	int rear;//队尾
	int maxsize;//队列长度
	int cursize;//当前元素个数
	Object[] queue;
	
	public SeqQueue() {
		// TODO 自动生成的构造函数存根
		initiate(defaultsize);
	}
	
	public SeqQueue(int sz){
		initiate(sz);
	}
	private void initiate(int sz) {
		// TODO 自动生成的方法存根
		maxsize = sz;
		front = 0;
		rear = 0;
		cursize = rear-front;
		queue = new Object[sz];
	}

	@Override
	public void enQueue(Object obj) throws Exception {
		// TODO 自动生成的方法存根
		//1、判断队列是否已满
		if((cursize)==maxsize){
			throw new Exception("队列已满，无法入队！");
		}
		//2、入队
		for (int i = cursize; i>rear; i--) {
			queue[i] = queue[i-1];
		}
		queue[rear] = obj;
		front = cursize;
		cursize++;
	}

	@Override
	public Object deQueue() throws Exception {
		// TODO 自动生成的方法存根
		//1、判断队列是否为空
		if(cursize==0){
			throw new Exception("队列已空，无法删除！");
		}
		//2、删除元素
		Object obj = queue[front];
		queue[front] = null;
		cursize--;
		front--;
		return obj;
	}

	@Override
	public Object getFront() throws Exception {
		// TODO 自动生成的方法存根
		//1、判断是否为空
		if(cursize==0){
			throw new Exception("队列已空，无法获取头元素！");
		}
		return queue[front];
	}

	@Override
	public boolean isEmpty() {
		// TODO 自动生成的方法存根
		return cursize>=0;
	}
	public void show(){
		for (int i = 0; i < queue.length; i++) {
			System.out.print(queue[i]+"  "); 
		}
	}
	public static void main(String[] args) {
		SeqQueue seqQueue = new SeqQueue();
		try {
			for (int j = 0; j < 10; j++) {
				seqQueue.enQueue("string"+j);
				seqQueue.show();
				System.out.println();
			}	
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		try {
			
			System.out.println("删除的元素为："+seqQueue.deQueue());
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		seqQueue.show();
		System.out.println();
		try {
			for (int j = 0; j < 1; j++) {
				seqQueue.enQueue("string"+j);
				seqQueue.show();
				System.out.println();
			}	
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		try {
			while(seqQueue.isEmpty()){
				seqQueue.deQueue();
				seqQueue.show();
				System.out.println();
				System.out.println("头元素为："+seqQueue.getFront());
				seqQueue.show();
				System.out.println();
			}	
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
