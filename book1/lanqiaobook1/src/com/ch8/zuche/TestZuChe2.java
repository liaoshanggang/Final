package com.ch8.zuche;

public class TestZuChe2 {
	public static void main(String[] args) {
		Truck truck = new Truck("大力士二代","10吨");//初始化卡车对象truck
		truck.show();//输出轿车信息
		truck.drive();//让车行驶1次，油量剩下15升，车损度为10
		truck.show();//输出车辆信息
		truck.drive();//让truck再行驶1次，油量剩下10升，车损度为20
		truck.drive();//让truck再行驶1次，油量剩下5升，车损度为30
		truck.drive();//让truck再行驶1次，因油量不足10升，不行驶，提示需要加油
		truck.addOil();//让truck加油1次，油量增加20升，达到25升
		truck.show();//输出车辆信息
	}
}
