package com.ch8.test8_13;
//卡车类
public class Truck extends Vehicle{
	private String load = "10吨";//吨位
	public Truck(String name){
		super(name);
	}
	public Truck(String name,String load){
		super(name);//子类无法继承父类的构造方法
//		this(name);//第一句
		this.load = load;
	}
	//显示车辆信息
	public void show(){
		System.out.println("显示车辆信息:\n车辆名称是："+this.name+" 吨位是："
	+this.load+" 车油量是："+this.oil+" 车损度是："+this.loss);
	}
	@Override
	public void drive() {
		// TODO 自动生成的方法存根
		if(oil<15){
			System.out.println("油量不足15升，需要加油！");
		}else{
			System.out.println("正在行驶！");
			oil -= 10;
			loss += 15;
		}
	}
	@Override
	public void addOil() {
		// TODO 自动生成的方法存根
		super.addOil();
		System.out.println("还没有想到在父类方法加油的基础上增加一些功能");
	}
	//获取吨位
	public String getLoad(){
		return load;
	}
}
