package com.ch8.zuche;

public class TestZuChe2 {
	public static void main(String[] args) {
		Truck truck = new Truck("����ʿ����","10��");//��ʼ����������truck
		truck.show();//����γ���Ϣ
		truck.drive();//�ó���ʻ1�Σ�����ʣ��15���������Ϊ10
		truck.show();//���������Ϣ
		truck.drive();//��truck����ʻ1�Σ�����ʣ��10���������Ϊ20
		truck.drive();//��truck����ʻ1�Σ�����ʣ��5���������Ϊ30
		truck.drive();//��truck����ʻ1�Σ�����������10��������ʻ����ʾ��Ҫ����
		truck.addOil();//��truck����1�Σ���������20�����ﵽ25��
		truck.show();//���������Ϣ
	}
}
