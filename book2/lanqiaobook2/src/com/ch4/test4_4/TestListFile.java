package com.ch4.test4_4;

import java.io.File;
import java.io.FileFilter;

public class TestListFile {
	public static void main(String[] args) {
		File f = new File("G:\\WorkSpace\\lanqiaobook2\\src\\com\\ch4\\test4_4");
		System.out.println("***ʹ��list����������ȡString����***");
		String list[] = f.list();
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("***ʹ��listFile������ȡFile����***");
		File file[] = f.listFiles();
		for (File file2 : file) {
			System.out.println(file2.getName());
		}
		//ʹ�������ڲ��ഴ�������������˳�.java��β���ļ�
		System.out.println("***ʹ��listFiles��filter���������˳�.java�ļ�***");
		File file1[] = f.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO �Զ����ɵķ������
				if(pathname.getName().endsWith(".java")){
					return true;
				}
				return false;
			}
		});
		for (File file2 : file1) {
			System.out.println(file2.getName());
		}
	}
}
