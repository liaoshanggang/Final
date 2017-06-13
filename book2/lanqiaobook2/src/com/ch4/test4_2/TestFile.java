package com.ch4.test4_2;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		System.out.println("文件系统根目录：");
		for (File root : File.listRoots()) {
			System.out.format("%s", root);
		}
		System.out.println();
		showFile();
	}

	private static void showFile() throws IOException {
		// TODO 自动生成的方法存根
		File f1 = new File("D:\\HelloFile.java");
		File f = new File("G:\\WorkSpace\\lanqiaobook2\\src\\com\\ch4\\test4_2\\HelloFile1.java");
		//当不存在该文件时，创建一个新的空文件
		System.out.println("创建f1文件是否成功："+f.createNewFile());
		System.out.format("输出字符串f:%s%n",f);
		System.out.format("判断File类对象是否存在：%b%n",f.exists() );
		System.out.format("获取File类对象最后修改时间：%tc%n",f.lastModified());
		System.out.format("判断File类对象是否是目录：%b%n",f.isDirectory());
		System.out.format("判断File类对象是否是文件：%b%n", f.isFile());
		System.out.format("判断File类对象是否有隐藏属性%b%n", f.isHidden());
		System.out.format("判断文件是否可读：%b%n", f.canRead());
		System.out.format("判断File类对象是否可写%b%n", f.canWrite());
		System.out.format("判断文件是否可执行:%b%n", f.canExecute());
		System.out.format("判断File类对象是否是绝对路径：%b%n", f.isAbsolute());
		System.out.format("获取File类对象的长度：%d%n", f.length());
		System.out.format("获取File类对象的名称：%s%n", f.getName());
		System.out.format("获取File类对象的路径：%s%n", f.getPath());
		System.out.format("获取File类对象当绝对路径：%s%n", f.getAbsolutePath());
		System.out.format("获取File类对象父目录当路径：%s%n", f.getParent());
	}
}
