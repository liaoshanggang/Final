package com.ch8.test8_14;

public class Super {
	static{
		System.out.println("显示：父类中的静态块！");
	}
	{
		System.out.println("显示：父类中的非静态块！");
	}
	Super(){
		System.out.println("显示：父类构造方法！");
	}
}
