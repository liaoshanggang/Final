package com.ch6.test6_10;

public class TestSyncThread {
	public static void main(String[] args) {
		//创建一个线程之间竞争使用的对象
//		Object obj =  new Object();
		for (int i = 0; i < 5; i++) {
//			new Thread(new SyncThread(i)).start();
//			new Thread(new SyncThread(i,obj)).start();
			new Thread(new SyncThread(i)).start();
		}
	}	
}

class SyncThread implements Runnable {
	
	private int id;
//	private Object lock;
	//在线程类内部定义一个静态共享资源lock
	private static Object lock = new Object();
	
	public SyncThread(int id) {
		// TODO 自动生成的构造函数存根
		this.id = id;
	}
	public SyncThread(int id,Object obj) {
		// TODO 自动生成的构造函数存根
		this(id);
		this.lock = obj;
	}
	
//	@Override
//	public void run() {
//		// TODO 自动生成的方法存根
//		synchronized (lock) {
//			for (int i = 0; i < 10; i++) {
//			System.out.println("线程ID名为：" + this.id + "正在输出：" + i);
//			}
//		}
//	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		doTask(id);
	}
	
	//通过类的静态方法实现互斥访问
	private static synchronized void doTask(int id) {
		for (int i = 0; i < 10; i++) {
			System.out.println("线程ID名为："+id+"正在输出："+i);
		}
	}
	
}