package com.ch9.test9_8;

/**要创建一封电子邮件，至少需要发信者邮箱、收信者邮箱、邮箱主题和邮件内容4个部分，
 * 可以采用接口定义电子邮件的这些约定，让电子邮件类必须实现这个接口，
 * 从而达到让电子邮件必须满足这些约定的要求
 * @author gg
 *
 */
public interface EmailInterface {
	//设置发信者邮箱
	public void setSendAdd(String add);
	//设置收信者邮箱
	public void receiveAdd(String add);
	//设置邮箱主题
	public void setEmailTitle(String title);
	//设置邮件内容
	public void writeEmail(String email);
	//接口中不能有实体方法
	/*public void showEmail(){
		
	}*/
}
