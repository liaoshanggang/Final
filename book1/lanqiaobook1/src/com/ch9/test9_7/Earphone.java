package com.ch9.test9_7;

public class Earphone implements BlueTooth{
	String name = "蓝牙耳机";

	@Override
	public void input() {
		// TODO 自动生成的方法存根
		System.out.println(name+"正在输入音频数据....");
	}

	@Override
	public void output() {
		// TODO 自动生成的方法存根
		System.out.println(name+"正在输出反馈信息.....");
	}
	
}
