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
	static final String[] names = {"战神","跑得快","大力士","大力士二代"};
	static final int[] oils = {20,40,20,30};
	static final int[] losss = {0,23,213,12};
	static final String[] others = {"长城","红旗","100吨","30吨"};
	static DataInputStream in = null;
	static DataOutputStream out = null;
	
	public static void main(String[] args) throws IOException {
		try {
			//输出数据流，向dataFile输出数据
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
			//输出数据流，从dataFile读取数据
			in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));
			while(true){
				type = in.readInt();
				name = in.readUTF();
				oil = in.readInt();
				loss = in.readInt();
				other = in.readUTF();
				if(type==1){
					System.out.println("显示车辆信息：\n车型：轿车 车辆名称为："+name+" 品牌是："
							+other+" 油量是："+oil+" 车损度是："+loss);
				}else {
					System.out.println("显示车辆信息：\n车型：卡车 车辆名称为："+name+" 吨位是："
							+other+" 油量是："+oil+" 车损度是："+loss);
				}
			}
		} catch (EOFException e) {
			//EOFException 作为读取结束的标志
		} finally {
			in.close();
		}
		
	}
}
