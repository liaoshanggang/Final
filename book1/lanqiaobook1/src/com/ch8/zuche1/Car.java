package com.ch8.zuche1;

public class Car {
	//����
	private String name = "�ɼ�";
	//����
	private int oil = 20;
	//�����
	private int loss = 0;
	//Ʒ��
	private String brand = "����";
	
	//���췽��,ָ��������Ʒ��
	public Car(String name,String brand){
		this.name = name;
		this.brand = brand;
	}
	//��ʾ������Ϣ
	public void show(){
		System.out.println("��ʾ������Ϣ��\n��������Ϊ��"+this.name+" Ʒ���ǣ�"
	+this.brand+"�����ǣ�"+"this.oil"+"������ǣ�"+this.loss);
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
	
	public String getBrand() {
		return brand;
	}
	//����
	public void addOil(){//�������20���򳬹�������������ӵ�60������
		if(oil>40){
			oil = 60;
			System.out.println("�����Ѽ�����");
		}else{
			oil = oil + 20;//����20��
		}
	}
	//��ʻ
	public void drive(){
		if(oil<10){
			System.out.println("��������10������Ҫ���ͣ�");
		}else{
			System.out.println("������ʻ��");
			oil = oil - 5;
			loss = loss + 10;
		}
	}
	
	
}
