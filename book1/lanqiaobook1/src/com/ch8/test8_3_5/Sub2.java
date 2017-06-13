package com.ch8.test8_3_5;

public class Sub2 extends Super2{
	public int i = 100;
	
	@Override
	public void show() {
		// TODO 自动生成的方法存根
		System.out.println("子类方法");
	}
	public static void main(String[] args) {
		Super2 sup2 = new Sub2();//创建父类对象，用子类实现
		sup2.show();//调用的是子类方法，覆盖了父类方法
		System.out.println("父类属性："+sup2.i);
	}
}
