package com.ch6.test6_3;

public class TestThread {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		t1.start();
		MyThread2 mt2 = new MyThread2();
		Thread t2 = new Thread(mt2);
		t2.start();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		t2.run();
	}
}
