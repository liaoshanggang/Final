package com.ch8.test8_13;

import java.util.Scanner;


/**�����Ϊ��
 * ����ÿ��ʻ1�Σ����ʹ�5������Ϊ10�������ӳ����10�������������15����
 * ��������ʻ��ֱ���ڿ���̨�������������15������Ҫ���ͣ���
 * ��Truck����д����ķ���
 * @author gg
 *
 */
public class TestRentChe3 {
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
