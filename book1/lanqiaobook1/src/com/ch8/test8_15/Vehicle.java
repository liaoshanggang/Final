package com.ch8.test8_15;

public class Vehicle {
//	private ���������޷��̳и����з���Ȩ�����η�Ϊprivate�����Ժͷ���
	//һ����Ϊdefault,��ͨ��get����
	 String name = "����";//����
	 int oil = 20;//����
	 int loss = 0; //�����
	public Vehicle(){
		
	}
	public Vehicle(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getOil() {
		return oil;
	}
	
	public int getLoss() {
		return loss;
	}
	public void addOil(){
		if(oil>40){
			oil = 60;
			System.out.println("�����Ѽ�����");
		}else{
			oil += 20;
		}
	}
	public void drive(){
		if(oil<10){
			System.out.println("��������10������Ҫ���ͣ�");
		}else{
			System.out.println("��������ʻ��");
			loss += 10;
			oil -= 5;
		}
	}
}
