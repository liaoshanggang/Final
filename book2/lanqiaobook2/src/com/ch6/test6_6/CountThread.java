package com.ch6.test6_6;

public class CountThread extends Thread {
	private int i = 0;
	
	public CountThread() {
		// TODO �Զ����ɵĹ��캯�����
		super("�����߳�");
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while (i<100) {
			System.out.println(this.getName() + "������" + (i+1));
			i++;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				System.out.println("���򲶻���InterruptedException�쳣��");
			}
			System.out.println("�����߳�����1�Σ�");
		}
	}
}
