package com.ch8.zuche1;

public class Truck {
	private String name = "大力士";
	private int oid = 20;
	private int loss = 0;
	private String load = "10吨";
	//构造方法，指定车名和品牌
	public Truck(String name,String load){
		this.name = name;
		this.load = load;
	}
	//显示车辆信息
	public void show(){
		System.out.println("显示车辆信息：\n车辆名称为："+this.name+"吨位是："+
	this.load+"油量是："+this.oid+"车损度为："+this.loss);
	}
	public String getName() {
		return name;
	}
	
	public int getOid() {
		return oid;
	}
	
	public int getLoss() {
		return loss;
	}
	
	public String getLoad() {
		return load;
	}
	public void addOid(){
		//加油功能为实现
	}
	public void drive(){
		//行驶功能未实现
	}
	
}
