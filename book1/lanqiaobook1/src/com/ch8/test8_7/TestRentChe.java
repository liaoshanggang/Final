package com.ch8.test8_7;

import java.util.Scanner;

/**
 * 《租车系统》需求：
 * （1）在控制台输出”请选择要租车的类型：（1代表轿车，2代表卡车），等待用户输入。
 * （2）如果用户选择的是轿车，则在控制台输出“请选择轿车品牌：（1代表红旗，2代表长城）”，等待用户输入。
 * （3）如果用户选择的是卡车，则在控制台输出“请选择卡车吨位：（1代表5吨，2代表10吨）”，等待用户输入。
 * （4）在控制台输出“请给所租的车起名”，等待用户输入车名。
 * （5）所租的车油量默认值为20升，车辆损耗度为0（表示刚保养完的车，无损耗）。
 * （6）具有显示所租车辆信息的功能，显示的信息包括车名、品牌/吨位、油量和车损度。
 * （7）租车时指定车的类型和品牌（或吨位），之后不能修改
 * （8）油量和车损度租车时取默认值，只有通过车的加油和行驶的行为改变其油量和车损度值，不允许直接修改。
 * @author gg
 *
 */
public class TestRentChe {
	public static void main(String[] args) {
		String name = null;//车名
		int oil = 20;//油量
		int loss = 0;//车损度
		String load = null;//吨位
		String brand = null;//品牌
		Scanner in = new Scanner(System.in);
		System.out.println("***欢迎来到蓝桥租车系统***");
		System.out.println("请选择要租车的类型：（1代表轿车，2代表卡车）");
		int userSel = in.nextInt();
		switch(userSel){
		case 1:
			System.out.println("请选择轿车的品牌：（1代表红旗，2代表长城）");
			userSel = in.nextInt();
			if(userSel==1){
				brand = "红旗";
			}else{
				brand = "长城";
			}
			System.out.println("请给所租的车起名：");
			name = in.next();//输入车名
			Car car = new Car(name,brand);//使用构造方法初始化车名和品牌
			car.show();
			break;
		case 2:
			System.out.println("请选择卡车的吨位：（1代表5吨，2代表10吨）");
			userSel = in.nextInt();
			if(userSel==1){
				load = "5吨";
			}else{
				load = "10吨";
			}
			System.out.println("请给所租的车起名：");
			name = in.next();//输入车名
			Truck truck = new Truck(name,load);//使用构造方法初始化车名和吨位
			truck.show();
			break;
		}
	}
}
