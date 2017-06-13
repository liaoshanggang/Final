package com.ch3.test3_7;

public class Car extends Vehicle{
	private String brand = "红旗";//品牌
	//构造方法，指定车名和品牌
	public Car(String name,String brand){
		super(name);
		this.brand = brand;
	}
	//显示车辆信息
	public void show(){
		System.out.println("显示车辆信息：\n车辆名称为："+this.name+"品牌是："+this.brand+"油量是："+this.oil+"车损度为："+this.loss);
	}
	//获取品牌
	public String getBrand() {
		return brand;
	}
	
}
