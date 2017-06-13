package com.ch8.test8_15;

public class Vehicle {
//	private 出错子类无法继承父类中访问权限修饰符为private的属性和方法
	//一调整为default,二通过get方法
	 String name = "汽车";//车名
	 int oil = 20;//油量
	 int loss = 0; //车损度
	public Vehicle(){
		
	}
	public Vehicle(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getOil() {
		return oil;
	}
	
	public int getLoss() {
		return loss;
	}
	public void addOil(){
		if(oil>40){
			oil = 60;
			System.out.println("油箱已加满！");
		}else{
			oil += 20;
		}
	}
	public void drive(){
		if(oil<10){
			System.out.println("油量不足10升，需要加油！");
		}else{
			System.out.println("！正在行驶！");
			loss += 10;
			oil -= 5;
		}
	}
}
