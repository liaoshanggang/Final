package com.ch9.test9_6;
//轿车类
public class Car extends Vehicle{
	private String brand = "红旗";//品牌

	public Car(String name,String brand){
		super(name);
		this.brand = brand;
	}
	//显示车辆信息
	public void show(){
		System.out.println("显示车辆信息：\n车辆名称为："+this.name+
				" 品牌是："+this.brand+" 油量是："+getOil()+" 车损度是："+this.loss);
	}
	//获得品牌
	public String getBrand(){
		return brand;
	}
//	实现了抽象类的抽象方法
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
