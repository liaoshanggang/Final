package com.ch9.test9_7;

public class TestInterface {
	public static void main(String[] args) {
		BlueTooth ep = new Earphone();//创建并实例化一个实现了蓝牙接口的蓝牙耳机对象ep
		ep.input();//调用ep的输入功能
		BlueTooth ip = new IPad();//创建并实例化一个实现了蓝牙接口的ipad对象ip
		ip.input();
		ip.output();
	}
}
