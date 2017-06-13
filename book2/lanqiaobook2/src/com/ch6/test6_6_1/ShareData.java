package com.ch6.test6_6_1;

public class ShareData {
	static int data = 0;
	
	public static void main(String[] args) {
		ShareThread1 st1 = new ShareThread1();
		ShareThread2 st2 = new ShareThread2();
		new Thread(st1).start();
		new Thread(st2).start();
		
	}
	
	//�ڲ��࣬�������о�̬��Ա����data
	private static class ShareThread1 implements Runnable {
		@Override
		public void run() {
			// TODO �Զ����ɵķ������
			while (data<10) {
				try {
					Thread.sleep(1000);
					System.out.println("���С��10�������ǣ�" + data++);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}	
	}
	
	//�ڲ��࣬�������о�̬��Ա����data
	private static class ShareThread2 implements Runnable {

		@Override
		public void run() {
			// TODO �Զ����ɵķ������
			while (data<100) {
				data++;
			}
		}
		
	}
}
