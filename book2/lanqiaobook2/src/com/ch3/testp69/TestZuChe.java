package com.ch3.testp69;

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
 * ��1���û����Ա������ϵͳ�����еĳ�������ֻ�ܿ������ͺͳ���
 * ��2�����û�ѡ��ĳ����ʱ����Ҫ������ʾ������Ϣ
 * ��1����ʾϵͳ�й��ж�������
 * ��2������ϵͳ����Ա��ָ��λ������һ������Ҫ��ϵͳ����Աȷ�����͡�������Ʒ�ƻ��λ��
 * ��3���ж������ӵĳ��Ƿ���ϵͳ�У�����ʾλ�á�
 * @author gg
 *
 */
public class TestZuChe {
	public static void main(String[] args) {//����HashSet���ϣ����ڴ�ų���
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
		System.out.println("ϵͳ�й���"+vehAL.size()+"����");
		System.out.println("***��ʾ���⳵ϵͳ����all����***");
		System.out.println("������Ҫ���ӵĳ���");
		System.out.println("������ָ��λ�ã�");
		int id = in.nextInt();
		System.out.println("�����복�ͣ�"); 
		System.out.println("�����복����");
		String name = in.next();
		System.out.println("������Ʒ�ƣ�");
		String brand = in.next();
		System.out.println("�������λ��");
		String load = in.next();
		
		Vehicle addcar = new Car(name,brand);
		vehAL.add(id, addcar);
		Vehicle addTruck = new Truck(name,load);
		vehAL.add(id, addTruck);
		System.out.println("�ж����ӵĳ��Ƿ���ϵͳ��");
		System.out.println("�ó���λ�ã�"+vehAL.indexOf(addcar));
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
	public static void countChe(){
		
	}
	public static void addCarByIndex(){
		
	}
	public static void isInSystem(){
		
	}
}
