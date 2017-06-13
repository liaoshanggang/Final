package com.ch4.test4_4;

import java.io.File;
import java.io.FileFilter;

public class TestListFile {
	public static void main(String[] args) {
		File f = new File("G:\\WorkSpace\\lanqiaobook2\\src\\com\\ch4\\test4_4");
		System.out.println("***使用list（）方法获取String数组***");
		String list[] = f.list();
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("***使用listFile（）获取File数组***");
		File file[] = f.listFiles();
		for (File file2 : file) {
			System.out.println(file2.getName());
		}
		//使用匿名内部类创建过滤器，过滤出.java结尾的文件
		System.out.println("***使用listFiles（filter）方法过滤出.java文件***");
		File file1[] = f.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO 自动生成的方法存根
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
