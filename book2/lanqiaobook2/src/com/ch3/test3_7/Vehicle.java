package com.ch3.test3_7;

public class Vehicle {
	/*private*/ String name =  "����";//����
	/*private*/ int oil = 20;//����
	/*private*/ int loss = 0;//�����
	//�޲ι��췽��
	public Vehicle(){
		
	}
	//���췽����ָ������
	public Vehicle(String name){
		this.name = name;
	}
	//��ȡ����
	public String getName() {
		return name;
	}
	//��ȡ����
	public int getOil() {
		return oil;
	}
	//��ȡ�����
	public int getLoss() {
		return loss;
	}
	//����
	public void addOil(){
		if(oil>40){
			oil = 60;
			System.out.println("�����Ѽ�����");
		}else{
			oil = oil + 20;
		}
		System.out.println("������ɣ�");
	}
	//��ʻ
	public void drive(){
		if(oil<10){
			System.out.println("��������10������Ҫ���ͣ�");
		}else{
			System.out.println("������ʻ��");
			oil -= 5;
			loss += 10;
		}
	}
	public void show() {
		// TODO �Զ����ɵķ������
		
	}
	
	
}
