package com.ch9.test9_8;

public class Email implements EmailInterface{
	String sendAdd = "";//����������
	String receiveAdd = "";//����������
	String emailTitle = "";//��������
	String email = "";//�ʼ�����
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
		System.out.println("���������䣺"+sendAdd);
		System.out.println("���������䣺"+receiveAdd);
		System.out.println("�������⣺"+emailTitle);
		System.out.println("�ʼ����ݣ�"+email);
	}

}
