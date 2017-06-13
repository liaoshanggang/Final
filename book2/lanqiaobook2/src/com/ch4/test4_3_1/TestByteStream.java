package com.ch4.test4_3_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制文件内容
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
			//通过构造方法之一：String构造输入流
			fis = new FileInputStream("G:\\WorkSpace\\lanqiaobook2\\src\\com\\ch4\\test4_1_3\\TestStaticImport.java");
			//通过构造方法之一：File类构造输出流
			fos = new FileOutputStream(f,true);
			//通过逐个读取、存入字节，实现文件复制
			int c;
			int i=0;
			while ((c=fis.read())!=-1) {
				System.out.println(c);
				i++;
				System.out.println("读取第"+i+"个字节");
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
