package com.ch8.zuche1;

public class Truck {
	private String name = "����ʿ";
	private int oid = 20;
	private int loss = 0;
	private String load = "10��";
	//���췽����ָ��������Ʒ��
	public Truck(String name,String load){
		this.name = name;
		this.load = load;
	}
	//��ʾ������Ϣ
	public void show(){
		System.out.println("��ʾ������Ϣ��\n��������Ϊ��"+this.name+"��λ�ǣ�"+
	this.load+"�����ǣ�"+this.oid+"�����Ϊ��"+this.loss);
	}
	public String getName() {
		return name;
	}
	
	public int getOid() {
		return oid;
	}
	
	public int getLoss() {
		return loss;
	}
	
	public String getLoad() {
		return load;
	}
	public void addOid(){
		//���͹���Ϊʵ��
	}
	public void drive(){
		//��ʻ����δʵ��
	}
	
}
