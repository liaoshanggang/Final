package com.ch6.test6_7;

public class SThread extends Thread {
	int i = 0;
	
	//��0�����9
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try {
			while (i<100) {
				Thread.sleep(1000);
				System.out.println("SThread����ÿ��1��������֣�" + i++);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
