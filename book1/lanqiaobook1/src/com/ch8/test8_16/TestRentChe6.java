package com.ch8.test8_16;


/**需求变为：
 * （1）不论是轿车还是卡车，油箱最多可以装60升汽油，每次给车加油，增加油量20升。
 * 如果加油20升超过油箱容量时，则加到60升即可，并在控制台输出“油箱已加满”。
 * （2）汽车行驶1次，耗油5升，车损度增加10，如果油量低于10升，则不允许行驶，直接在控制台输出“油量不足10升，需要加油！”
 *
 */
public class TestRentChe6 {
	public static void main(String[] args) {
		Vehicle v = new Car("战神","长城");//声明父类对象，实例化出子类对象
		v.show();//实际调用子类重写父类的show()方法
//		System.out.println(v.getBrand());//编译错误，无法调用子类特有的方法
		Car car = (Car) v;
		System.out.println(car.getBrand());//调用Car类特有方法
		
//		//错误，对象v不可以强制类型转换成Truck类型的，对象v实例化的时候是Car类型，把Car类型转换成Truck类型，会抛出异常
//		Truck truck = (Truck) v;//将对象v强制转换成Truck类对象
//		System.out.println(truck.getLoad());//调用Truck特有方法getLoad()
	}
}
