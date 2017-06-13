
package com.ch8.test8_16;
//驾驶员（租车者）类
/**
 *  需求变为：
 * 发现程序中需要新建一个驾驶员（租车者）类，这个类有一个姓名属性，还有两个获取车辆信息的方法，
 * @author gg
 *
 */
public class Driver {
	String name = "驾驶员";//驾驶员姓名
	//构造方法，指定驾驶员名
	public Driver(String name){
		this.name = name;
	}
	//获取驾驶员名
	public String getName(){
		return name;
	}
	//参数不再是具体的车辆类型了，而是这些车辆类型的父类Vehicle,在方法体里调用父类的show()方法
	public void callShow(Vehicle v){
		v.show();
	}
	
//	//用了2个重载的方法，如果从Vehicle类继承了10种车辆类型是不是要写10个方法，？？？？？？？？？？
//	//驾驶员获取轿车车辆信息，输入参数为轿车对象
//	public void callShow(Car car){
//		car.show();
//	}
//	//驾驶员获取卡车车辆信息，输入参数为卡车对象
//	public void callShow(Truck truck){
//		truck.show();
//	}
}
