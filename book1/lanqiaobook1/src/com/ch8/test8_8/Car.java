package com.ch8.test8_8;
//�γ���
public class Car {
	private String name = "�ɼ�";//����
	private int oil = 20;//����
	private int loss = 0;//�����
	private String brand = "����";//Ʒ��
	//�⳵ʱ����ָ���������ͺ�Ʒ�ƣ�֮�����޸�
	//���췽����ʵ�ֶ����ͺ�Ʒ�Ƶĳ�ʼ��
	public Car(String name,String brand){
		this.name = name;
		this.brand = brand;
	}
	//��ʾ������Ϣ
	public void show(){
		System.out.println("��ʾ������Ϣ��\n��������Ϊ��"+this.name+
				" Ʒ���ǣ�"+this.brand+" �����ǣ�"+this.oil+" ������ǣ�"+this.loss);
	}
	//��ó���
	public String getName(){
		return name;
	}
	//�������
	public int getOil(){
		return oil; 
	}
	//��ó����
	public int getLoss(){
		return loss;
	}
	//���Ʒ��
	public String getBrand(){
		return brand;
	}
	
	//ͨ�����ļ�����Ϊ�ı������ͳ����
	
	public void addOil(){
		//���͹���
		if(oil>40){//�������40��ֱ�Ӱ�������Ϊ60
			oil = 60;
			System.out.println("�����Ѽ���");
		}else{
			oil += 20;			
		}
	}
	//ͨ��������ʻ����Ϊ�ı䳵���
	public void drive(){
		//��ʻ����δʵ��
		if(oil<10){
			System.out.println("��������10������Ҫ���ͣ�");
		}else{
			System.out.println("������������������������ʻ������������������");
			oil -= 5;
			loss += 10;			
		}
	}
}
