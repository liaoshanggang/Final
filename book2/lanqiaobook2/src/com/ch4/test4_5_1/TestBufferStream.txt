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
			//逐行读取、存入字符串，实现文件复制
			String s;
			while((s=in.readLine())!=null){
				out.write(s);
				//写入一个分行符，否则内容在一行显示
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
