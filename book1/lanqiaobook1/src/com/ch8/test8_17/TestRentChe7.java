package com.ch8.test8_17;


/**�����Ϊ��
 * ��1�������ǽγ����ǿ���������������װ60�����ͣ�ÿ�θ������ͣ���������20����
 * �������20��������������ʱ����ӵ�60�����ɣ����ڿ���̨����������Ѽ�������
 * ��2��������ʻ1�Σ�����5�������������10�������������10������������ʻ��ֱ���ڿ���̨�������������10������Ҫ���ͣ���
 *
 */
public class TestRentChe7 {
	public static void main(String[] args) {
		Vehicle v = new Car("ս��","����");//�����������ʵ�������������
		v.show();//ʵ�ʵ���������д�����show()����
		if(v instanceof Car){//����v����Car����
			Car car = (Car) v;//������vǿ��ת����Car�����
			System.out.println(car.getBrand());
		}else{
			Truck truck = (Truck) v;
			System.out.println(truck.getLoad());
		}
	}
}
