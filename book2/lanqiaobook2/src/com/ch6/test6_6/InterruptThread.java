package com.ch6.test6_6;

public class InterruptThread {
	public static void main(String[] args) {
		CountThread t = new CountThread();
		t.start();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		t.interrupt();
	}
}
