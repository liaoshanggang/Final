package com.ch4.test4_2;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		System.out.println("�ļ�ϵͳ��Ŀ¼��");
		for (File root : File.listRoots()) {
			System.out.format("%s", root);
		}
		System.out.println();
		showFile();
	}

	private static void showFile() throws IOException {
		// TODO �Զ����ɵķ������
		File f1 = new File("D:\\HelloFile.java");
		File f = new File("G:\\WorkSpace\\lanqiaobook2\\src\\com\\ch4\\test4_2\\HelloFile1.java");
		//�������ڸ��ļ�ʱ������һ���µĿ��ļ�
		System.out.println("����f1�ļ��Ƿ�ɹ���"+f.createNewFile());
		System.out.format("����ַ���f:%s%n",f);
		System.out.format("�ж�File������Ƿ���ڣ�%b%n",f.exists() );
		System.out.format("��ȡFile���������޸�ʱ�䣺%tc%n",f.lastModified());
		System.out.format("�ж�File������Ƿ���Ŀ¼��%b%n",f.isDirectory());
		System.out.format("�ж�File������Ƿ����ļ���%b%n", f.isFile());
		System.out.format("�ж�File������Ƿ�����������%b%n", f.isHidden());
		System.out.format("�ж��ļ��Ƿ�ɶ���%b%n", f.canRead());
		System.out.format("�ж�File������Ƿ��д%b%n", f.canWrite());
		System.out.format("�ж��ļ��Ƿ��ִ��:%b%n", f.canExecute());
		System.out.format("�ж�File������Ƿ��Ǿ���·����%b%n", f.isAbsolute());
		System.out.format("��ȡFile�����ĳ��ȣ�%d%n", f.length());
		System.out.format("��ȡFile���������ƣ�%s%n", f.getName());
		System.out.format("��ȡFile������·����%s%n", f.getPath());
		System.out.format("��ȡFile����󵱾���·����%s%n", f.getAbsolutePath());
		System.out.format("��ȡFile�����Ŀ¼��·����%s%n", f.getParent());
	}
}
