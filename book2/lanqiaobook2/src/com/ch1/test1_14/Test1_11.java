package com.ch1.test1_14;

public class Test1_11 {
	public static void main(String[] args) {
		try {
			String teachers[] = {"Lfj","jsfkd","sdf"};
			for (int i = 0; i < 4; i++) {
				System.out.println(teachers[i]);
				
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("���������±�Խ���쳣���ɹ�����");
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����쳣���ɹ�����");
		}finally{
			System.out.println("��ʾ��ϣ�");
		}
	}
}
