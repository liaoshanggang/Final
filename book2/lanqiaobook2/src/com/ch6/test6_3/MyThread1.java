package com.ch6.test6_3;

//�̳���Thread�ഴ���߳���
public class MyThread1 extends Thread {
	private int i = 0;

	// �޲ι��췽�������ø��๹�췽�������߳�����
	public MyThread1() {
		// TODO �Զ����ɵĹ��캯�����
		super("�ҵ��߳�1");
	}

	// ͨ��ѭ���жϣ����10�Σ�ÿ�μ��0.5��
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try {
			while (i<10) {
				System.out.println(this.getName()+"���е�"+(i+1)+"��");
				i++;
				//��ָ���ĺ��������õ�ǰ����ִ�е��߳����ߣ���ִͣ�У�
				sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
