package com.ch3.test3_6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ��1��ϵͳ��������������γ��Ϳ������û�����
 * ��2��ϵͳ����Ա���Ա������ϵͳ�����еĳ���
 * ��3������ʱ�ǽγ�������ʾ�γ�Ʒ�ƣ��ǿ���������ʾ������λ��ͬʱ������ʾ������Ϣ
 * @author gg
 *
 */
public class TestZuChe {
	public static void main(String[] args) {
		//����HashSet���ϣ����ڴ�ų���
		Set vehSet = new HashSet();
		//����2���γ�����2���������󣬲����뵽HashSet������
		Vehicle c1 = new Car("ս��","����");
		Vehicle c2 = new Car("�ܵĿ�","����");
		Vehicle t1 = new Truck("����ʿ","5��");
		Vehicle t2 = new Truck("��������","10��");
		vehSet.add(c1);
		vehSet.add(c2);
		vehSet.add(t1);
		vehSet.add(t2);
		//ʹ�õ�����ѭ�����
		Iterator it = vehSet.iterator();
		while(it.hasNext()){
			System.out.println("*********��ʾ������Ԫ����Ϣ******");
			Object obj = it.next();
			if(obj instanceof Car){
				Car c = (Car) obj;
				System.out.println("�ó��ǽγ�����Ʒ��Ϊ��"+c.getBrand());
			}else{
				Truck t = (Truck) obj;
				System.out.println("�ó��ǿ��������λΪ��"+t.getLoad());
			}
			((Vehicle)obj).show();
		}
	}
}
