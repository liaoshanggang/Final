package com.ch6.test6_5;

public class CountThread extends Thread{
	private int i = 0;
	
	public CountThread() {
		super("计数线程");
	}
	
	//通过设置i=100,让线程终止
	public void stopIt(){
		i = 100;
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (i<100) {
			System.out.println(this.getName() + "计数：" + (i+1));
			i++;
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
