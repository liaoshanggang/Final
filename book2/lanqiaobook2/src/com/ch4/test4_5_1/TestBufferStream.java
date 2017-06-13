package com.ch4.test4_5_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStream {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			in = new BufferedReader(new FileReader("G:\\WorkSpace\\lanqiaobook2"
					+ "\\src\\com\\ch4\\test4_5_1\\TestBufferStream.java"));
			out = new BufferedWriter(new FileWriter("G:\\WorkSpace\\lanqiaobook2"
					+ "\\src\\com\\ch4\\test4_5_1\\TestBufferStream.txt"));
			//���ж�ȡ�������ַ�����ʵ���ļ�����
			String s;
			while((s=in.readLine())!=null){
				out.write(s);
				//д��һ�����з�������������һ����ʾ
				out.newLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if(in!=null){
				in.close();
			}
			if(out!=null){
				out.close();
			}
		}
	}
}
