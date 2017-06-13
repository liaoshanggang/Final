package com.ch8.test8_8;
//轿车类
public class Car {
	private String name = "飞箭";//车名
	private int oil = 20;//油量
	private int loss = 0;//车损度
	private String brand = "红旗";//品牌
	//租车时可以指定车的类型和品牌，之后不能修改
	//构造方法，实现对类型和品牌的初始化
	public Car(String name,String brand){
		this.name = name;
		this.brand = brand;
	}
	//显示车辆信息
	public void show(){
		System.out.println("显示车辆信息：\n车辆名称为："+this.name+
				" 品牌是："+this.brand+" 油量是："+this.oil+" 车损度是："+this.loss);
	}
	//获得车名
	public String getName(){
		return name;
	}
	//获得油量
	public int getOil(){
		return oil; 
	}
	//获得车损度
	public int getLoss(){
		return loss;
	}
	//获得品牌
	public String getBrand(){
		return brand;
	}
	
	//通过车的加油行为改变油量和车损度
	
	public void addOil(){
		//加油功能
		if(oil>40){//油箱大于40就直接把油量变为60
			oil = 60;
			System.out.println("油箱已加满");
		}else{
			oil += 20;			
		}
	}
	//通过车的行驶的行为改变车损度
	public void drive(){
		//行驶功能未实现
		if(oil<10){
			System.out.println("油量不足10升，需要加油！");
		}else{
			System.out.println("！。。。。。。。。正在行驶。。。。。。。。！");
			oil -= 5;
			loss += 10;			
		}
	}
}
