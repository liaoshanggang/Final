package com.ch6.test6_8;

public class QThread extends Thread {
	int i = 0;
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (i<100) {
			System.out.println("QThread正在输出数字：" + i++);
		}
	}
}
