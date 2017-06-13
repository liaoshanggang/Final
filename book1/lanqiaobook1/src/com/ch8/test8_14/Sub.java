package com.ch8.test8_14;

public class Sub extends Super{
	static{
		System.out.println("显示：子类中的静态块！");
	}
	{
		System.out.println("显示：子类中的非静态块！");
	}
	Sub(){
		System.out.println("显示：子类构造方法！");
	}
}
