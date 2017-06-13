package com.ch9.test9_12;

public class TestPrinter {
	public static void main(String[] args) {
		PrintBox box = null;//黑盒
		PrintPaper paper = null;//纸张
		Printer printer = new Printer();//打印机
		//使用彩色黑盒在B5上打印
		box = new ColorPrintBox();
		paper = new B5Paper();
		printer.print(box, paper);
		//使用黑白盒在A4上打印
		box = new GrayPrintBox();
		paper = new A4Paper();
		printer.print(box, paper);
	}
}
