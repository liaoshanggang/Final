package com.ch3.test3_7;

public class Car extends Vehicle{
	private String brand = "����";//Ʒ��
	//���췽����ָ��������Ʒ��
	public Car(String name,String brand){
		super(name);
		this.brand = brand;
	}
	//��ʾ������Ϣ
	public void show(){
		System.out.println("��ʾ������Ϣ��\n��������Ϊ��"+this.name+"Ʒ���ǣ�"+this.brand+"�����ǣ�"+this.oil+"�����Ϊ��"+this.loss);
	}
	//��ȡƷ��
	public String getBrand() {
		return brand;
	}
	
}
