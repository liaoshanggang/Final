package com.ch8.test8_11;

import java.util.Scanner;

/**�����Ϊ��
 * ��1�������ǽγ����ǿ���������������װ60�����ͣ�ÿ�θ������ͣ���������20����
 * �������20��������������ʱ����ӵ�60�����ɣ����ڿ���̨����������Ѽ�������
 * ��2��������ʻ1�Σ�����5�������������10�������������10������������ʻ��ֱ���ڿ���̨�������������10������Ҫ���ͣ���
 */
public class TestRentChe2 {
	public static void main(String[] args) {
		Truck truck = new Truck("����ʿ����","10��");
		truck.show();
		truck.drive();
		truck.show();
		truck.drive();
		truck.show();
		truck.drive();
		truck.show();
		truck.drive();
		truck.show();
		truck.addOil();
		truck.show();
	}
}
