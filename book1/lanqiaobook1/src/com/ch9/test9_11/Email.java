package com.ch9.test9_11;

public class Email implements EmailInterface/*,PortInterface*/{
	String sendAdd = "";//����������
	String receiveAdd = "";//����������
	String emailTitle = "";//��������
	String email = "";//�ʼ�����
	int sendPort = 25;//���Ͷ˶˿ں�
	int receivePort = 110;//���ܶ˶˿ں�
	@Override
	public void setSendAdd(String add) {
		// TODO �Զ����ɵķ������
		this.sendAdd = add;
	}

	@Override
	public void receiveAdd(String add) {
		// TODO �Զ����ɵķ������
		this.receiveAdd = add;
	}

	@Override
	public void setEmailTitle(String title) {
		// TODO �Զ����ɵķ������
		this.emailTitle = title;
	}

	@Override
	public void writeEmail(String email) {
		// TODO �Զ����ɵķ������
		this.email = email;
	}
	//��ʾ�����ʼ�ȫ����Ϣ
	public void showEmail(){
		System.out.println("***��ʾ�����ʼ�����***");
//		System.out.println("���Ͷ˿ںţ�"+setPort);
		System.out.println("���ܶ˶˿ںţ�"+sendPort);
		System.out.println("���Ͷ˶˿ںţ�"+receivePort);
		System.out.println("���������䣺"+sendAdd);
		System.out.println("���������䣺"+receiveAdd);
		System.out.println("�������⣺"+emailTitle);
		System.out.println("�ʼ����ݣ�"+email);
	}

	@Override
	public void setSendPort(int port) {
		// TODO �Զ����ɵķ������
		this.sendPort = port;
	}

	@Override
	public void setReceivePort(int port) {
		// TODO �Զ����ɵķ������
		this.receivePort = port;
	}

}
