package com.ch8.test8_13;
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
	@Override
	public void drive() {
		// TODO �Զ����ɵķ������
		if(oil<15){
			System.out.println("��������15������Ҫ���ͣ�");
		}else{
			System.out.println("������ʻ��");
			oil -= 10;
			loss += 15;
		}
	}
	@Override
	public void addOil() {
		// TODO �Զ����ɵķ������
		super.addOil();
		System.out.println("��û���뵽�ڸ��෽�����͵Ļ���������һЩ����");
	}
	//��ȡ��λ
	public String getLoad(){
		return load;
	}
}
