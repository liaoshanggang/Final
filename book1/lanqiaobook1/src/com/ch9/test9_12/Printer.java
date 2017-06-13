package com.ch9.test9_12;

public class Printer {
	//使用黑盒在纸张上打印
	public void print(PrintBox box,PrintPaper paper){
		System.out.println("正在使用"+box.getColor()+"黑盒在"+paper.getSize()+"纸张上打印！");
	}
}
