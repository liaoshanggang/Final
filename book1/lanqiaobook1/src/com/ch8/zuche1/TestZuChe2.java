package com.ch8.zuche1;

public class TestZuChe2 {
	public static void main(String[] args) {
		Car car = new Car("ս��","����");//��ʼ���γ�����car
		car.show();//����γ���Ϣ
		car.drive();//�ó���ʻ1�Σ�����ʣ��15���������Ϊ10
		car.show();//���������Ϣ
		car.drive();//��car����ʻ1�Σ�����ʣ��10���������Ϊ20
		car.drive();//��car����ʻ1�Σ�����ʣ��5���������Ϊ30
		car.drive();//��car����ʻ1�Σ�����������10��������ʻ����ʾ��Ҫ����
		car.addOil();//��car����1�Σ���������20�����ﵽ25��
		car.show();//���������Ϣ
	}
}
