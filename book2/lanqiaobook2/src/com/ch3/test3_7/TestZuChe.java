package com.ch3.test3_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * （1）用户可以遍历这个系统里所有的车辆，但只能看到车型和车名
 * （2）当用户选中某俩车时，需要完整显示车辆信息
 * @author gg
 *
 */
public class TestZuChe {
	public static void main(String[] args) {
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
		System.out.println("***显示《租车系统》中all车辆***");
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
}
