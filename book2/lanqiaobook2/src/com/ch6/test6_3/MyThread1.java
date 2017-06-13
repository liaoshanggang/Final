package com.ch6.test6_3;

//继承自Thread类创建线程类
public class MyThread1 extends Thread {
	private int i = 0;

	// 无参构造方法，调用父类构造方法设置线程名称
	public MyThread1() {
		// TODO 自动生成的构造函数存根
		super("我的线程1");
	}

	// 通过循环判断，输出10次，每次间隔0.5秒
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			while (i<10) {
				System.out.println(this.getName()+"运行第"+(i+1)+"次");
				i++;
				//在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）
				sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
