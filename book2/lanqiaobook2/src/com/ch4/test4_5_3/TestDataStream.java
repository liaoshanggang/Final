package com.ch4.test4_5_3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
	static final String dataFile = "G:\\WorkSpace\\lanqiaobook2"
			+ "\\src\\com\\ch4\\test4_5_3\\data";
	static final int[] types = {1,1,2,2};
	static final String[] names = {"ս��","�ܵÿ�","����ʿ","����ʿ����"};
	static final int[] oils = {20,40,20,30};
	static final int[] losss = {0,23,213,12};
	static final String[] others = {"����","����","100��","30��"};
	static DataInputStream in = null;
	static DataOutputStream out = null;
	
	public static void main(String[] args) throws IOException {
		try {
			//�������������dataFile�������
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
			for (int i = 0; i < types.length; i++) {
				out.writeInt(types[i]);
				out.writeUTF(names[i]);
				out.writeInt(oils[i]);
				out.writeInt(losss[i]);
				out.writeUTF(others[i]);
			} 
		} finally {
			out.close();
		}
		try {
			int type,oil,loss;
			String name,other;
			//�������������dataFile��ȡ����
			in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));
			while(true){
				type = in.readInt();
				name = in.readUTF();
				oil = in.readInt();
				loss = in.readInt();
				other = in.readUTF();
				if(type==1){
					System.out.println("��ʾ������Ϣ��\n���ͣ��γ� ��������Ϊ��"+name+" Ʒ���ǣ�"
							+other+" �����ǣ�"+oil+" ������ǣ�"+loss);
				}else {
					System.out.println("��ʾ������Ϣ��\n���ͣ����� ��������Ϊ��"+name+" ��λ�ǣ�"
							+other+" �����ǣ�"+oil+" ������ǣ�"+loss);
				}
			}
		} catch (EOFException e) {
			//EOFException ��Ϊ��ȡ�����ı�־
		} finally {
			in.close();
		}
		
	}
}
