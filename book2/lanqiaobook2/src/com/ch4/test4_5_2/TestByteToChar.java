package com.ch4.test4_5_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ʹ��һ�������ַ���������ȡ�û��������������һ������
public class TestByteToChar {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("���������������˵�Ļ���");
			String s = in.readLine();
			System.out.println("����������ǣ�"+s);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if(in!=null){
				in.close();
			}
		}
	}
}
