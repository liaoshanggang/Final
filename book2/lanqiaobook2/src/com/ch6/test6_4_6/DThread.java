package com.ch6.test6_4_6;

public class DThread extends Thread {
	//���޲ι��췽�������ñ��߳�Ϊ�ػ��߳�
	public DThread() {
		// TODO �Զ����ɵĹ��캯�����
		setDaemon(true);
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while (true) {
			System.out.println("���Ǻ�̨�߳�");
		}
	}
}
