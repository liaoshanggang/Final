package com.ch9.test9_6;
//������
public class Truck extends Vehicle{
	private String load = "10��";//��λ
	public Truck(String name){
		super(name);
	}
	public Truck(String name,String load){
		super(name);//�����޷��̳и���Ĺ��췽��
//		this(name);//��һ��
		this.load = load;
	}
	//��ʾ������Ϣ
	public void show(){
		System.out.println("��ʾ������Ϣ:\n���������ǣ�"+this.name+" ��λ�ǣ�"
	+this.load+" �������ǣ�"+this.oil+" ������ǣ�"+this.loss);
	}
	//��ȡ��λ
	public String getLoad(){
		return load;
	}
	@Override
	public void drive() {
		// TODO �Զ����ɵķ������
		
	}
}
