package com.ch4.test4_3_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �����ļ�����
 * @author gg
 *
 */
public class TestByteStream {
	public static void main(String[] args) throws IOException  {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File f = new File("G:\\WorkSpace\\lanqiaobook2\\src\\com\\ch4\\test4_3_1\\TestByteStream1.txt");
			//f.createNewFile();
			//ͨ�����췽��֮һ��String����������
			fis = new FileInputStream("G:\\WorkSpace\\lanqiaobook2\\src\\com\\ch4\\test4_1_3\\TestStaticImport.java");
			//ͨ�����췽��֮һ��File�๹�������
			fos = new FileOutputStream(f,true);
			//ͨ�������ȡ�������ֽڣ�ʵ���ļ�����
			int c;
			int i=0;
			while ((c=fis.read())!=-1) {
				System.out.println(c);
				i++;
				System.out.println("��ȡ��"+i+"���ֽ�");
				fos.write(c);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if(fis!=null){
				fis.close();
			}
			if(fos!=null){
				fos.close();
			}
		}
	}
}
