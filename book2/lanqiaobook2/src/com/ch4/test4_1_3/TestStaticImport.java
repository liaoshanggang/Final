package com.ch4.test4_1_3;
//��̬�����Ĵ���
import static java.lang.Integer.*;
import static java.lang.System.*;
class TestStaticImport1 {
	public static void main(String[] args){
		out.println(MAX_VALUE);
		out.print(toHexString(11));
	}
}
//û���õ���̬����ǰ������
public class TestStaticImport {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(12));
	}
}
