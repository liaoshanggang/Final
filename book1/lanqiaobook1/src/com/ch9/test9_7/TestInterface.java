package com.ch9.test9_7;

public class TestInterface {
	public static void main(String[] args) {
		BlueTooth ep = new Earphone();//������ʵ����һ��ʵ���������ӿڵ�������������ep
		ep.input();//����ep�����빦��
		BlueTooth ip = new IPad();//������ʵ����һ��ʵ���������ӿڵ�ipad����ip
		ip.input();
		ip.output();
	}
}
