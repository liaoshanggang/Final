package com.ch3.test3_14;

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
 * 通过泛型（即定义集合时同时定义集合中元素的类型）的方式，
 * 解决程序可读性以及强制类型转换时的稳定性问题
 * @author gg
 *
 */
public class TestZuChe {
	public static void main(String[] args) {
		List<Vehicle> vehAL = new ArrayList<Vehicle>();
		Vehicle c1 = new Car("战神","长城");
		Vehicle c2 = new Car("跑得快","法拉利");
		Vehicle t1 = new Truck("大理石", "20吨");
		Vehicle t2 = new Truck("大力神","50吨");
		vehAL.add(c1);
		vehAL.add(c2);
		vehAL.add(t1);
		vehAL.add(1,t2);
//		vehAL.add("大力士二代");//编译错误，添加的不是Vehicle类型
		System.out.println("**显示《租车系统》中全部车辆信息**");
		for (Vehicle vehicle : vehAL) {
			vehicle.show();
		}
	}
	
}
