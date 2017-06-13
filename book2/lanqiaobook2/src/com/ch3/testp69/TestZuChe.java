package com.ch3.testp69;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.ch3.testp65.Car;
import com.ch3.testp65.Truck;
import com.ch3.testp65.Vehicle;

/**
 * （1）用户可以遍历这个系统里所有的车辆，但只能看到车型和车名
 * （2）当用户选中某俩车时，需要完整显示车辆信息
 * （1）显示系统中共有多少辆车
 * （2）允许系统管理员在指定位置增加一辆车（要求系统管理员确定车型、车名和品牌或吨位）
 * （3）判断新增加的车是否在系统中，并显示位置。
 * @author gg
 *
 */
public class TestZuChe {
	public static void main(String[] args) {//创建HashSet集合，用于存放车辆
		int index = -1;//用于显示序号
		Scanner in = new Scanner(System.in);
		//创建ArrayList集合，用于存放车辆
		List vehAL = new ArrayList();
		Vehicle car1 = new Car("跑跑", "红旗");
		Vehicle car2 = new Car("飞飞", "奔驰");
		Vehicle trunk1 = new Truck("大哥", "20");
		Vehicle trunk2 = new Truck("大哥大大", "50");	
		vehAL.add(car1);
		vehAL.add(car2);
		vehAL.add(trunk1);
		vehAL.add(trunk2);
		System.out.println("系统中共有"+vehAL.size()+"辆车");
		System.out.println("***显示《租车系统》中all车辆***");
		System.out.println("请输入要增加的车：");
		System.out.println("请输入指定位置：");
		int id = in.nextInt();
		System.out.println("请输入车型："); 
		System.out.println("请输入车名：");
		String name = in.next();
		System.out.println("请输入品牌：");
		String brand = in.next();
		System.out.println("请输入吨位：");
		String load = in.next();
		
		Vehicle addcar = new Car(name,brand);
		vehAL.add(id, addcar);
		Vehicle addTruck = new Truck(name,load);
		vehAL.add(id, addTruck);
		System.out.println("判断增加的车是否在系统中");
		System.out.println("该车的位置："+vehAL.indexOf(addcar));
		index = 1;
		for (Object object : vehAL) {
			if(object instanceof Car){
				Car car = (Car) object;
				System.out.println(index+"该车是轿车，其车名为："+car.getName());
			}else{
				Truck truck = (Truck) object;
				System.out.println(index+"该车是卡车，其车名为："+truck.getLoad());
			}
			index++;
		}
		System.out.println("请输入要显示详细信息的车辆编号：");
		((Vehicle)vehAL.get(in.nextInt()-1)).show();//;
		
	}
	public static void countChe(){
		
	}
	public static void addCarByIndex(){
		
	}
	public static void isInSystem(){
		
	}
}
