package com.ch8.test8_8;

import java.util.Scanner;

/**�����Ϊ��
 * ��1�������ǽγ����ǿ���������������װ60�����ͣ�ÿ�θ������ͣ���������20����
 * �������20��������������ʱ����ӵ�60�����ɣ����ڿ���̨����������Ѽ�������
 * ��2��������ʻ1�Σ�����5�������������10�������������10������������ʻ��ֱ���ڿ���̨�������������10������Ҫ���ͣ���
 */
public class TestRentChe1 {
	public static void main(String[] args) {
		Car car = new Car("��ɶ","������");//��ʼ���γ�����car
		car.show();//���������Ϣ
		car.drive();
		car.show();
		car.drive();
		car.show();
		car.drive();
		car.show();
		car.drive();
		car.show();
		car.addOil();
		car.show();
		car.addOil();
		car.show();
		car.addOil();
		car.show();
		
	}
}
