package com.ch8.test8_15duotaiup;


/**需求变为：
 * （1）不论是轿车还是卡车，油箱最多可以装60升汽油，每次给车加油，增加油量20升。
 * 如果加油20升超过油箱容量时，则加到60升即可，并在控制台输出“油箱已加满”。
 * （2）汽车行驶1次，耗油5升，车损度增加10，如果油量低于10升，则不允许行驶，直接在控制台输出“油量不足10升，需要加油！”
 *
 */
public class TestRentChe5 {
	public static void main(String[] args) {
		Car car = new Car("战神","长城");//初始化轿车对象car
		Truck truck = new Truck("大力士二代","10吨");//初始化卡车对象truck
		Driver d1 = new Driver("厉害了");//创建并初始化驾驶员对象
		//实际传入的是子类对象，最终执行的是子类对象重写的show()方法
		d1.callShow(car);//调用驾驶员对象的相应方法
		d1.callShow(truck);//调用驾驶员对象的相应方法
	}
}
