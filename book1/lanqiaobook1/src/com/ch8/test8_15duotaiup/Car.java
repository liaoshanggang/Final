package com.ch8.test8_15duotaiup;
//�γ���
public class Car extends Vehicle{
	private String brand = "����";//Ʒ��

	public Car(String name,String brand){
		super(name);
		this.brand = brand;
	}
	//��ʾ������Ϣ
	public void show(){
		System.out.println("��ʾ������Ϣ��\n��������Ϊ��"+this.name+
				" Ʒ���ǣ�"+this.brand+" �����ǣ�"+getOil()+" ������ǣ�"+this.loss);
	}
	//���Ʒ��
	public String getBrand(){
		return brand;
	}
	
}
