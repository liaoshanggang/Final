package com.ch6.test6_8;

public class SThread extends Thread {
	int i = 0;
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while (i<100) {
			System.out.println("SThread����������֣�" + i++);
		}
	}
}
