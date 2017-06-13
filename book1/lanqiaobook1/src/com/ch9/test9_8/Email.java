package com.ch9.test9_8;

public class Email implements EmailInterface{
	String sendAdd = "";//发信者邮箱
	String receiveAdd = "";//收信者邮箱
	String emailTitle = "";//邮箱主题
	String email = "";//邮件内容
	@Override
	public void setSendAdd(String add) {
		// TODO 自动生成的方法存根
		this.sendAdd = add;
	}

	@Override
	public void receiveAdd(String add) {
		// TODO 自动生成的方法存根
		this.receiveAdd = add;
	}

	@Override
	public void setEmailTitle(String title) {
		// TODO 自动生成的方法存根
		this.emailTitle = title;
	}

	@Override
	public void writeEmail(String email) {
		// TODO 自动生成的方法存根
		this.email = email;
	}
	//显示电子邮件全部信息
	public void showEmail(){
		System.out.println("***显示电子邮件内容***");
		System.out.println("发信者邮箱："+sendAdd);
		System.out.println("收信者邮箱："+receiveAdd);
		System.out.println("邮箱主题："+emailTitle);
		System.out.println("邮件内容："+email);
	}

}
