package com.ch9.test9_8;

/**Ҫ����һ������ʼ���������Ҫ���������䡢���������䡢����������ʼ�����4�����֣�
 * ���Բ��ýӿڶ�������ʼ�����ЩԼ�����õ����ʼ������ʵ������ӿڣ�
 * �Ӷ��ﵽ�õ����ʼ�����������ЩԼ����Ҫ��
 * @author gg
 *
 */
public interface EmailInterface {
	//���÷���������
	public void setSendAdd(String add);
	//��������������
	public void receiveAdd(String add);
	//������������
	public void setEmailTitle(String title);
	//�����ʼ�����
	public void writeEmail(String email);
	//�ӿ��в�����ʵ�巽��
	/*public void showEmail(){
		
	}*/
}
