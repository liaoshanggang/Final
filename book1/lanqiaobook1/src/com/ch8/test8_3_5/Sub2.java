package com.ch8.test8_3_5;

public class Sub2 extends Super2{
	public int i = 100;
	
	@Override
	public void show() {
		// TODO �Զ����ɵķ������
		System.out.println("���෽��");
	}
	public static void main(String[] args) {
		Super2 sup2 = new Sub2();//�����������������ʵ��
		sup2.show();//���õ������෽���������˸��෽��
		System.out.println("�������ԣ�"+sup2.i);
	}
}
