package com.ch8.zuche1;

import java.util.Scanner;

public class TestZuChe {
	public static void main(String[] args) {
		String name = null;//����
		int oil = 20;//����
		int loss = 0;//�����
		String brand = null;//Ʒ��
		String load = null;//��λ
		Scanner input = new Scanner(System.in);
		System.out.println("***��ӭ���������⳵ϵͳ***");
		System.out.println("��ѡ��Ҫ�⳵�����ͣ���1����γ���2��������");
		int select = input.nextInt();
		switch(select){
		case 1:
			System.out.println("��ѡ��γ�Ʒ�ƣ���1������죬2�����ǣ�");
			select = input.nextInt();
			if(select==1){
				brand = "����";
			}{
				brand = "����";
			}
			System.out.println("�������ĳ�������");
			name = input.next();//���복��
			Car car = new Car(name,brand);//ʹ�ù��췽����ʼ��������Ʒ��
			car.show();//���������Ϣ
			break;
		case 2:
			System.out.println("��ѡ�񿨳���λ����1����5�֣�2����10�֣�");
			select = input.nextInt();
			if(select==1){
				load = "5��";
			}else{
				load = "10��";
			}
			System.out.println("�������ĳ�������");
			name = input.next();
			Truck truck = new Truck(name, load);
			truck.show();
			break;
		}
		
	}
}
