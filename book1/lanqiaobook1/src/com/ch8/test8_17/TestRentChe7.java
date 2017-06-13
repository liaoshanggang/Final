package com.ch8.test8_17;


/**需求变为：
 * （1）不论是轿车还是卡车，油箱最多可以装60升汽油，每次给车加油，增加油量20升。
 * 如果加油20升超过油箱容量时，则加到60升即可，并在控制台输出“油箱已加满”。
 * （2）汽车行驶1次，耗油5升，车损度增加10，如果油量低于10升，则不允许行驶，直接在控制台输出“油量不足10升，需要加油！”
 *
 */
public class TestRentChe7 {
	public static void main(String[] args) {
		Vehicle v = new Car("战神","长城");//声明父类对象，实例化出子类对象
		v.show();//实际调用子类重写父类的show()方法
		if(v instanceof Car){//对象v属于Car类型
			Car car = (Car) v;//将对象v强制转换成Car类对象
			System.out.println(car.getBrand());
		}else{
			Truck truck = (Truck) v;
			System.out.println(truck.getLoad());
		}
	}
}
