package com.ch9.test9_6;

public abstract class Vehicle {
//	private 出错子类无法继承父类中访问权限修饰符为private的属性和方法
	//一调整为default,二通过get方法
	 String name = "汽车";//车名
	 int oil = 20;//油量
	 int loss = 0; //车损度
	 //增加一个show()方法,方法体为空，Car类和Truck类中的show()方法实际是重写了Vehicle类中的show()方法
	 public abstract void show();
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
	public abstract void drive();

}
