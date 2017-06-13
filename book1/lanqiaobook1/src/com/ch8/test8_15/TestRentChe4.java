package com.ch8.test8_15;

/**需求变为：
 * （1）不论是轿车还是卡车，油箱最多可以装60升汽油，每次给车加油，增加油量20升。
 * 如果加油20升超过油箱容量时，则加到60升即可，并在控制台输出“油箱已加满”。
 * （2）汽车行驶1次，耗油5升，车损度增加10，如果油量低于10升，则不允许行驶，直接在控制台输出“油量不足10升，需要加油！”
 *
 */
public class TestRentChe4 {
	public static void main(String[] args) {
		Car car = new Car("战神","长城");
		Truck truck = new Truck("大力士二代","10吨");
		Driver d1 = new Driver("厉害了");
		d1.callShow(car);
		d1.callShow(truck);
	}
}
