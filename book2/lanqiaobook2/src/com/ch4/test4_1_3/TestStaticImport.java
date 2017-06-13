package com.ch4.test4_1_3;
//静态导入后的代码
import static java.lang.Integer.*;
import static java.lang.System.*;
class TestStaticImport1 {
	public static void main(String[] args){
		out.println(MAX_VALUE);
		out.print(toHexString(11));
	}
}
//没有用到静态导入前当代码
public class TestStaticImport {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(12));
	}
}
