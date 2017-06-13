package com.ch1.test1_20;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestEx17 {
	public static ServerSocket ss = null;
	public static void doEx1() throws IOException {
		try {
			ss = new ServerSocket(5678);
			Socket socket = ss.accept();
		} catch (IOException e) {
			System.out.println("doEx1方法中处理IOException异常！");
			throw e;
			// TODO: handle exception
		}
		
	}
	public static void main(String[] args) {
		try {
			doEx1();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("main方法中出来IOException异常！");
		}finally{
			System.out.println("程序结束！");
		}
	}
}
