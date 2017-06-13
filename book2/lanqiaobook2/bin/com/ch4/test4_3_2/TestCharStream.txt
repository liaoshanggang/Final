package com.ch4.test4_3_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader(args[0]);
			out = new FileWriter(args[1]);
			int c;
			while ((c=in.read())!=-1) {
				out.write(c);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if(in!=null){
				in.close();
			}
			if (out!=null) {
				out.close();
			}
		}
	}
}
