package com.ch6.test6_6;

public class CountThread extends Thread {
	private int i = 0;
	
	public CountThread() {
		// TODO 自动生成的构造函数存根
		super("计数线程");
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (i<100) {
			System.out.println(this.getName() + "计数：" + (i+1));
			i++;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				System.out.println("程序捕获了InterruptedException异常！");
			}
			System.out.println("计数线程运行1次！");
		}
	}
}
