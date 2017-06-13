package com.ch8.zuche1;

public class TestZuChe2 {
	public static void main(String[] args) {
		Car car = new Car("战神","长城");//初始化轿车对象car
		car.show();//输出轿车信息
		car.drive();//让车行驶1次，油量剩下15升，车损度为10
		car.show();//输出车辆信息
		car.drive();//让car再行驶1次，油量剩下10升，车损度为20
		car.drive();//让car再行驶1次，油量剩下5升，车损度为30
		car.drive();//让car再行驶1次，因油量不足10升，不行驶，提示需要加油
		car.addOil();//让car加油1次，油量增加20升，达到25升
		car.show();//输出车辆信息
	}
}
