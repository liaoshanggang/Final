package com.ch3.test3_14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.ch3.testp65.Car;
import com.ch3.testp65.Truck;
import com.ch3.testp65.Vehicle;

/**
 * ͨ�����ͣ������弯��ʱͬʱ���弯����Ԫ�ص����ͣ��ķ�ʽ��
 * �������ɶ����Լ�ǿ������ת��ʱ���ȶ�������
 * @author gg
 *
 */
public class TestZuChe {
	public static void main(String[] args) {
		List<Vehicle> vehAL = new ArrayList<Vehicle>();
		Vehicle c1 = new Car("ս��","����");
		Vehicle c2 = new Car("�ܵÿ�","������");
		Vehicle t1 = new Truck("����ʯ", "20��");
		Vehicle t2 = new Truck("������","50��");
		vehAL.add(c1);
		vehAL.add(c2);
		vehAL.add(t1);
		vehAL.add(1,t2);
//		vehAL.add("����ʿ����");//���������ӵĲ���Vehicle����
		System.out.println("**��ʾ���⳵ϵͳ����ȫ��������Ϣ**");
		for (Vehicle vehicle : vehAL) {
			vehicle.show();
		}
	}
	
}
