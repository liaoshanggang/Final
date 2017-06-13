package com.ch8.test8_13;

import java.util.Scanner;


/**需求变为：
 * 卡车每行驶1次，耗油从5升提升为10升，增加车损度10，如果油量低于15升，
 * 则不允许行驶，直接在控制台输出“油量不足15升，需要加油！”
 * 看Truck中重写父类的方法
 * @author gg
 *
 */
public class TestRentChe3 {
	public static void main(String[] args) {
		Truck truck = new Truck("大力士二代","10吨");
		truck.show();
		truck.drive();
		truck.show();
		truck.drive();
		truck.show();
		truck.drive();
		truck.show();
		truck.drive();
		truck.show();
		truck.addOil();
		truck.show();
	}
}
