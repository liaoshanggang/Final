
package com.ch8.test8_16;
//��ʻԱ���⳵�ߣ���
/**
 *  �����Ϊ��
 * ���ֳ�������Ҫ�½�һ����ʻԱ���⳵�ߣ��࣬�������һ���������ԣ�����������ȡ������Ϣ�ķ�����
 * @author gg
 *
 */
public class Driver {
	String name = "��ʻԱ";//��ʻԱ����
	//���췽����ָ����ʻԱ��
	public Driver(String name){
		this.name = name;
	}
	//��ȡ��ʻԱ��
	public String getName(){
		return name;
	}
	//���������Ǿ���ĳ��������ˣ�������Щ�������͵ĸ���Vehicle,�ڷ���������ø����show()����
	public void callShow(Vehicle v){
		v.show();
	}
	
//	//����2�����صķ����������Vehicle��̳���10�ֳ��������ǲ���Ҫд10����������������������������
//	//��ʻԱ��ȡ�γ�������Ϣ���������Ϊ�γ�����
//	public void callShow(Car car){
//		car.show();
//	}
//	//��ʻԱ��ȡ����������Ϣ���������Ϊ��������
//	public void callShow(Truck truck){
//		truck.show();
//	}
}
