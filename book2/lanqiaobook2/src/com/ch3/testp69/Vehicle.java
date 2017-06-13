package com.ch3.testp69;

public class Vehicle implements Comparable{
	/*private*/ String name =  "汽车";//车名
	/*private*/ int oil = 20;//油量
	/*private*/ int loss = 0;//车损度
	//无参构造方法
	public Vehicle(){
		
	}
	//构造方法，指定车名
	public Vehicle(String name){
		this.name = name;
	}
	//获取车名
	public String getName() {
		return name;
	}
	//获取油量
	public int getOil() {
		return oil;
	}
	//获取车损度
	public int getLoss() {
		return loss;
	}
	//加油
	public void addOil(){
		if(oil>40){
			oil = 60;
			System.out.println("邮箱已加满！");
		}else{
			oil = oil + 20;
		}
		System.out.println("加油完成！");
	}
	//行驶
	public void drive(){
		if(oil<10){
			System.out.println("油量不足10升，需要加油！");
		}else{
			System.out.println("正在行驶！");
			oil -= 5;
			loss += 10;
		}
	}
	public void show() {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		Vehicle inv = (Vehicle) o;
//		String res = name>inv.name?-1:(name=inv.name?0:1);
		return 0;
	}
	
	
}
