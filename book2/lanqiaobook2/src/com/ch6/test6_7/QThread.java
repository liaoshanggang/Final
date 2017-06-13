package com.ch6.test6_7;

public class QThread extends Thread {
	int i = 0;
	Thread t = null;
	
	//构造方法，传入一个线程对象
	public QThread (Thread t) {
		super("QThread线程");
		this.t = t;
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			while (i<100) {
				//当i=5,调用传入线程对象的join()方法，等传入线程执行完毕再执行本线程
				if (i!=5) {
					Thread.sleep(500);
					System.out.println("QThread正在每隔0.5秒输出数字：" + i++);	
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
