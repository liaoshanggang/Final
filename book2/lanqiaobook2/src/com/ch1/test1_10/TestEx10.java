package com.ch1.test1_10;

public class TestEx10 {
public static void main(String[] args) {
	try {
		String teachers[] = {"����","����","����"};
		for (int i = 0; i < 4; i++) {
			System.out.println(teachers[i]);
			
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("�����±�Խ�磬���޸ĳ���");
		//return;//finally�����Ȼִ��
		System.exit(1);//ֱ���˳�JVM��finally���鲻��ִ��
	}finally{
		System.out.println("��ʾ��ϣ�");
	}
}
}
