package com.ch6.test6_4_6;

public class DThread extends Thread {
	//在无参构造方法中设置本线程为守护线程
	public DThread() {
		// TODO 自动生成的构造函数存根
		setDaemon(true);
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (true) {
			System.out.println("我是后台线程");
		}
	}
}
