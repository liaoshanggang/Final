package com.ch3.testp65;

public class Truck extends Vehicle{
	private String load = "10��";
	public Truck(String name,String load){
		super(name);
		this.load = load;
	}
	//��ʾ������Ϣ
	public void show(){
		System.out.println("��ʾ������Ϣ��\n��������Ϊ��"+this.name+"��λ�ǣ�"+this.load+"�����ǣ�"+this.oil+"�����Ϊ��"+this.loss);
	}
	public String getLoad() {
		return load;
	}
	
	
}
