package com.ch1.test1_9;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestEx8 {
	//声明服务器端套接字对象
	public static ServerSocket ss = null;
	public static void main(String[] args) throws IOException{
		try {
			//实例化服务器端套接字，服务器套接字等待请求通过网络传入
			ss = new ServerSocket(5678);//5678端口号
			//侦听并接受到此套接字的连接
			Socket socket = ss.accept();
			//省略其他
		} catch (IOException e) {
			// TODO: handle exception
			//关闭此套接字
			//ss.close();
		}finally{
			ss.close();
		}
		
		//省略其他
	}
}
