package com.ch1.test1_9;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestEx8 {
	//�������������׽��ֶ���
	public static ServerSocket ss = null;
	public static void main(String[] args) throws IOException{
		try {
			//ʵ�������������׽��֣��������׽��ֵȴ�����ͨ�����紫��
			ss = new ServerSocket(5678);//5678�˿ں�
			//���������ܵ����׽��ֵ�����
			Socket socket = ss.accept();
			//ʡ������
		} catch (IOException e) {
			// TODO: handle exception
			//�رմ��׽���
			//ss.close();
		}finally{
			ss.close();
		}
		
		//ʡ������
	}
}
