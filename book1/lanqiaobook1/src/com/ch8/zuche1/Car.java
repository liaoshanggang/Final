package com.ch8.zuche1;

public class Car {
	//车名
	private String name = "飞箭";
	//油量
	private int oil = 20;
	//车损度
	private int loss = 0;
	//品牌
	private String brand = "红旗";
	
	//构造方法,指定车名和品牌
	public Car(String name,String brand){
		this.name = name;
		this.brand = brand;
	}
	//显示车辆信息
	public void show(){
		System.out.println("显示车辆信息：\n车辆名称为："+this.name+" 品牌是："
	+this.brand+"油量是："+"this.oil"+"车损度是："+this.loss);
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
	
	public String getBrand() {
		return brand;
	}
	//加油
	public void addOil(){//如果加油20升则超过邮箱容量，则加到60升即可
		if(oil>40){
			oil = 60;
			System.out.println("邮箱已加满！");
		}else{
			oil = oil + 20;//加油20升
		}
	}
	//行驶
	public void drive(){
		if(oil<10){
			System.out.println("油量不足10升，需要加油！");
		}else{
			System.out.println("正在行驶！");
			oil = oil - 5;
			loss = loss + 10;
		}
	}
	
	
}
