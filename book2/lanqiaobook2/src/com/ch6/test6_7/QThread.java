package com.ch6.test6_7;

public class QThread extends Thread {
	int i = 0;
	Thread t = null;
	
	//���췽��������һ���̶߳���
	public QThread (Thread t) {
		super("QThread�߳�");
		this.t = t;
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try {
			while (i<100) {
				//��i=5,���ô����̶߳����join()�������ȴ����߳�ִ�������ִ�б��߳�
				if (i!=5) {
					Thread.sleep(500);
					System.out.println("QThread����ÿ��0.5��������֣�" + i++);	
				} else {
					t.join();
				}
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
