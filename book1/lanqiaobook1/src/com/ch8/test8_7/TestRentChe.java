package com.ch8.test8_7;

import java.util.Scanner;

/**
 * ���⳵ϵͳ������
 * ��1���ڿ���̨�������ѡ��Ҫ�⳵�����ͣ���1����γ���2�����������ȴ��û����롣
 * ��2������û�ѡ����ǽγ������ڿ���̨�������ѡ��γ�Ʒ�ƣ���1������죬2�����ǣ������ȴ��û����롣
 * ��3������û�ѡ����ǿ��������ڿ���̨�������ѡ�񿨳���λ����1����5�֣�2����10�֣������ȴ��û����롣
 * ��4���ڿ���̨������������ĳ����������ȴ��û����복����
 * ��5������ĳ�����Ĭ��ֵΪ20����������Ķ�Ϊ0����ʾ�ձ�����ĳ�������ģ���
 * ��6��������ʾ���⳵����Ϣ�Ĺ��ܣ���ʾ����Ϣ����������Ʒ��/��λ�������ͳ���ȡ�
 * ��7���⳵ʱָ���������ͺ�Ʒ�ƣ����λ����֮�����޸�
 * ��8�������ͳ�����⳵ʱȡĬ��ֵ��ֻ��ͨ�����ļ��ͺ���ʻ����Ϊ�ı��������ͳ����ֵ��������ֱ���޸ġ�
 * @author gg
 *
 */
public class TestRentChe {
	public static void main(String[] args) {
		String name = null;//����
		int oil = 20;//����
		int loss = 0;//�����
		String load = null;//��λ
		String brand = null;//Ʒ��
		Scanner in = new Scanner(System.in);
		System.out.println("***��ӭ���������⳵ϵͳ***");
		System.out.println("��ѡ��Ҫ�⳵�����ͣ���1����γ���2��������");
		int userSel = in.nextInt();
		switch(userSel){
		case 1:
			System.out.println("��ѡ��γ���Ʒ�ƣ���1������죬2�����ǣ�");
			userSel = in.nextInt();
			if(userSel==1){
				brand = "����";
			}else{
				brand = "����";
			}
			System.out.println("�������ĳ�������");
			name = in.next();//���복��
			Car car = new Car(name,brand);//ʹ�ù��췽����ʼ��������Ʒ��
			car.show();
			break;
		case 2:
			System.out.println("��ѡ�񿨳��Ķ�λ����1����5�֣�2����10�֣�");
			userSel = in.nextInt();
			if(userSel==1){
				load = "5��";
			}else{
				load = "10��";
			}
			System.out.println("�������ĳ�������");
			name = in.next();//���복��
			Truck truck = new Truck(name,load);//ʹ�ù��췽����ʼ�������Ͷ�λ
			truck.show();
			break;
		}
	}
}
