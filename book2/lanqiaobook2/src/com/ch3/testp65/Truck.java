package com.ch3.testp65;

public class Truck extends Vehicle{
	private String load = "10吨";
	public Truck(String name,String load){
		super(name);
		this.load = load;
	}
	//显示车辆信息
	public void show(){
		System.out.println("显示车辆信息：\n车辆名称为："+this.name+"吨位是："+this.load+"油量是："+this.oil+"车损度为："+this.loss);
	}
	public String getLoad() {
		return load;
	}
	
	
}
