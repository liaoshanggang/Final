package com.ch3.test3_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * ��1���û����Ա������ϵͳ�����еĳ�������ֻ�ܿ������ͺͳ���
 * ��2�����û�ѡ��ĳ����ʱ����Ҫ������ʾ������Ϣ
 * @author gg
 *
 */
public class TestZuChe {
	public static void main(String[] args) {
		int index = -1;//������ʾ���
		Scanner in = new Scanner(System.in);
		//����ArrayList���ϣ����ڴ�ų���
		List vehAL = new ArrayList();
		Vehicle car1 = new Car("����", "����");
		Vehicle car2 = new Car("�ɷ�", "����");
		Vehicle trunk1 = new Truck("���", "20");
		Vehicle trunk2 = new Truck("�����", "50");	
		vehAL.add(car1);
		vehAL.add(car2);
		vehAL.add(trunk1);
		vehAL.add(trunk2);
		System.out.println("***��ʾ���⳵ϵͳ����all����***");
		index = 1;
		for (Object object : vehAL) {
			if(object instanceof Car){
				Car car = (Car) object;
				System.out.println(index+"�ó��ǽγ����䳵��Ϊ��"+car.getName());
			}else{
				Truck truck = (Truck) object;
				System.out.println(index+"�ó��ǿ������䳵��Ϊ��"+truck.getLoad());
			}
			index++;
		}
		System.out.println("������Ҫ��ʾ��ϸ��Ϣ�ĳ�����ţ�");
		((Vehicle)vehAL.get(in.nextInt()-1)).show();//;
	}
}
