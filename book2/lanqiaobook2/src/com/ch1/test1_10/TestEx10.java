package com.ch1.test1_10;

public class TestEx10 {
public static void main(String[] args) {
	try {
		String teachers[] = {"张三","李四","王五"};
		for (int i = 0; i < 4; i++) {
			System.out.println(teachers[i]);
			
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("数组下标越界，请修改程序！");
		//return;//finally语句仍然执行
		System.exit(1);//直接退出JVM，finally语句块不再执行
	}finally{
		System.out.println("显示完毕！");
	}
}
}
