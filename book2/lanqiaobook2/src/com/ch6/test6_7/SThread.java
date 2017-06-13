package com.ch6.test6_7;

public class SThread extends Thread {
	int i = 0;
	
	//从0输出到9
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			while (i<100) {
				Thread.sleep(1000);
				System.out.println("SThread正在每隔1秒输出数字：" + i++);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
