package com.ch8.test8_16;


/**�����Ϊ��
 * ��1�������ǽγ����ǿ���������������װ60�����ͣ�ÿ�θ������ͣ���������20����
 * �������20��������������ʱ����ӵ�60�����ɣ����ڿ���̨����������Ѽ�������
 * ��2��������ʻ1�Σ�����5�������������10�������������10������������ʻ��ֱ���ڿ���̨�������������10������Ҫ���ͣ���
 *
 */
public class TestRentChe6 {
	public static void main(String[] args) {
		Vehicle v = new Car("ս��","����");//�����������ʵ�������������
		v.show();//ʵ�ʵ���������д�����show()����
//		System.out.println(v.getBrand());//��������޷������������еķ���
		Car car = (Car) v;
		System.out.println(car.getBrand());//����Car�����з���
		
//		//���󣬶���v������ǿ������ת����Truck���͵ģ�����vʵ������ʱ����Car���ͣ���Car����ת����Truck���ͣ����׳��쳣
//		Truck truck = (Truck) v;//������vǿ��ת����Truck�����
//		System.out.println(truck.getLoad());//����Truck���з���getLoad()
	}
}
