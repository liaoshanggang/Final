package com.ch9.test9_6;
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
//	ʵ���˳�����ĳ��󷽷�
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
