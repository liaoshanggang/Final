package com.ch8.test8_8;
//������
public class Truck {
	private String name = "����ʿ";//����
	private int oil = 20;//����
	private int loss = 0;//�����
	private String load = "10��";//��λ
	//�⳵�ǿ���ָ���������ͺ�Ʒ�ƣ�֮�󲻿����޸�
	//���췽����ʵ��ָ��������Ʒ�Ƴ�ʼ��
	public Truck(String name,String load){
		this.name = name;
		this.load = load;
	}
	//��ʾ������Ϣ
	public void show(){
		System.out.println("��ʾ������Ϣ:\n���������ǣ�"+this.name+" ��λ�ǣ�"
	+this.load+" �������ǣ�"+this.oil+" ������ǣ�"+this.loss);
	}
	//��ȡ����
	public String getName(){
		return name;
	}
	//��ȡ����
	public int getOil(){
		return oil;
	}
	//��ȡ�����
	public int getLoss(){
		return loss;
	}
	//��ȡ��λ
	public String getLoad(){
		return load;
	}


	//����
	public void addOil(){
		//���͹���δʵ��
		if(oil>40){
			oil = 60;
			System.out.println("�����Ѽ���!");
		}else{
			oil += 20;
		}
	}
	//��ʻ
	public void drive(){
		//��ʻ����δʵ��
		if(oil<10){
			System.out.println("��������10������Ҫ���ͣ�");
		}else{
			System.out.println("������������������������ʻ������������������");
			oil += 5;
			loss -= 10;
		}
	}
}
