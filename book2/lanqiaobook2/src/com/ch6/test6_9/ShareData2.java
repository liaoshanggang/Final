package com.ch6.test6_9;

public class ShareData2 {
	static int data = 0;
	//定义一个锁对象lock
	static final Object lock = new Object();
	
	public static void main(String[] args) {
		ShareThread1 st1 = new ShareThread1();
		ShareThread2 st2 = new ShareThread2();
		new Thread(st1).start();
		new Thread(st2).start();
	}
	
	private static class ShareThread1 implements Runnable {

		@Override
		public void run() {
			// TODO 自动生成的方法存根
			//对lock对象上锁
			synchronized (lock) {
				while (data<10) {
					try {
						Thread.sleep(1000);
						System.out.println("这个小于10的数据是：" + data++);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}
	
	private static class ShareThread2 implements Runnable {

		@Override
		public void run() {
			// TODO 自动生成的方法存根
			synchronized (lock) {
				while (data<100) {
					data++;
				}
				System.out.println("ShareThread2执行完后data的值为：" + data);
			}
		}
		
	}
}
