package com.ch4.test4_5_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//使用一个输入字符缓存流读取用户在命令行输入的一行数据
public class TestByteToChar {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请输入你今天最想说的话：");
			String s = in.readLine();
			System.out.println("你最想表达的是："+s);
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
