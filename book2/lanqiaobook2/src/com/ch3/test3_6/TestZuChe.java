package com.ch3.test3_6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * （1）系统里可以有若干辆轿车和卡车供用户租用
 * （2）系统管理员可以遍历这个系统里所有的车辆
 * （3）遍历时是轿车，则显示轿车品牌，是卡车，则显示卡车吨位，同时完整显示车辆信息
 * @author gg
 *
 */
public class TestZuChe {
	public static void main(String[] args) {
		//创建HashSet集合，用于存放车辆
		Set vehSet = new HashSet();
		//创建2个轿车对象、2个卡车对象，并加入到HashSet集合中
		Vehicle c1 = new Car("战神","长城");
		Vehicle c2 = new Car("跑的快","红旗");
		Vehicle t1 = new Truck("大力士","5吨");
		Vehicle t2 = new Truck("大力二代","10吨");
		vehSet.add(c1);
		vehSet.add(c2);
		vehSet.add(t1);
		vehSet.add(t2);
		//使用迭代器循环输出
		Iterator it = vehSet.iterator();
		while(it.hasNext()){
			System.out.println("*********显示集合中元素信息******");
			Object obj = it.next();
			if(obj instanceof Car){
				Car c = (Car) obj;
				System.out.println("该车是轿车，其品牌为："+c.getBrand());
			}else{
				Truck t = (Truck) obj;
				System.out.println("该车是卡车，其吨位为："+t.getLoad());
			}
			((Vehicle)obj).show();
		}
	}
}
