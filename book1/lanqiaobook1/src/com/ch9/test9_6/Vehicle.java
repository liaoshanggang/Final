package com.ch9.test9_6;

public abstract class Vehicle {
//	private ���������޷��̳и����з���Ȩ�����η�Ϊprivate�����Ժͷ���
	//һ����Ϊdefault,��ͨ��get����
	 String name = "����";//����
	 int oil = 20;//����
	 int loss = 0; //�����
	 //����һ��show()����,������Ϊ�գ�Car���Truck���е�show()����ʵ������д��Vehicle���е�show()����
	 public abstract void show();
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
	public abstract void drive();

}
