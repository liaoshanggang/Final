package com.ch8.test8_8;
//卡车类
public class Truck {
	private String name = "大力士";//车名
	private int oil = 20;//油量
	private int loss = 0;//车损度
	private String load = "10吨";//吨位
	//租车是可以指定车的类型和品牌，之后不可以修改
	//构造方法，实现指定车名和品牌初始化
	public Truck(String name,String load){
		this.name = name;
		this.load = load;
	}
	//显示车辆信息
	public void show(){
		System.out.println("显示车辆信息:\n车辆名称是："+this.name+" 吨位是："
	+this.load+" 车油量是："+this.oil+" 车损度是："+this.loss);
	}
	//获取车名
	public String getName(){
		return name;
	}
	//获取油量
	public int getOil(){
		return oil;
	}
	//获取车损度
	public int getLoss(){
		return loss;
	}
	//获取吨位
	public String getLoad(){
		return load;
	}


	//加油
	public void addOil(){
		//加油功能未实现
		if(oil>40){
			oil = 60;
			System.out.println("油箱已加满!");
		}else{
			oil += 20;
		}
	}
	//行驶
	public void drive(){
		//行驶功能未实现
		if(oil<10){
			System.out.println("油量不足10升，需要加油！");
		}else{
			System.out.println("！。。。。。。。。正在行驶。。。。。。。。！");
			oil += 5;
			loss -= 10;
		}
	}
}
