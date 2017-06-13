package com.ch8.zuche1;

import java.util.Scanner;

public class TestZuChe {
	public static void main(String[] args) {
		String name = null;//车名
		int oil = 20;//油量
		int loss = 0;//车损度
		String brand = null;//品牌
		String load = null;//吨位
		Scanner input = new Scanner(System.in);
		System.out.println("***欢迎来到蓝桥租车系统***");
		System.out.println("请选择要租车的类型：（1代表轿车，2代表卡车）");
		int select = input.nextInt();
		switch(select){
		case 1:
			System.out.println("请选择轿车品牌：（1代表红旗，2代表长城）");
			select = input.nextInt();
			if(select==1){
				brand = "红旗";
			}{
				brand = "长城";
			}
			System.out.println("请给所租的车起名：");
			name = input.next();//输入车名
			Car car = new Car(name,brand);//使用构造方法初始化车名和品牌
			car.show();//输出车辆信息
			break;
		case 2:
			System.out.println("请选择卡车吨位：（1代表5吨，2代表10吨）");
			select = input.nextInt();
			if(select==1){
				load = "5吨";
			}else{
				load = "10吨";
			}
			System.out.println("请给所租的车起名：");
			name = input.next();
			Truck truck = new Truck(name, load);
			truck.show();
			break;
		}
		
	}
}
