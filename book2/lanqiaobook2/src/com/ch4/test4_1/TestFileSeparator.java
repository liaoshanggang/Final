package com.ch4.test4_1;

import java.io.File;

public class TestFileSeparator {
	public static void main(String[] args) {
		System.out.println("PATH�ָ������ֺ�"+File.pathSeparatorChar);
		System.out.println("·���ָ�������б��"+File.separator);
		String paths = File.pathSeparator;
		String s = File.separator;
		char pathc = File.pathSeparatorChar;
		char c = File.separatorChar;
		System.out.println(paths+s+pathc+c);
	}
}
