package com.ch6.test6_5;

public class CountThread extends Thread{
	private int i = 0;
	
	public CountThread() {
		super("�����߳�");
	}
	
	//ͨ������i=100,���߳���ֹ
	public void stopIt(){
		i = 100;
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while (i<100) {
			System.out.println(this.getName() + "������" + (i+1));
			i++;
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
