package com.ch9.test9_12;

public class TestPrinter {
	public static void main(String[] args) {
		PrintBox box = null;//�ں�
		PrintPaper paper = null;//ֽ��
		Printer printer = new Printer();//��ӡ��
		//ʹ�ò�ɫ�ں���B5�ϴ�ӡ
		box = new ColorPrintBox();
		paper = new B5Paper();
		printer.print(box, paper);
		//ʹ�úڰ׺���A4�ϴ�ӡ
		box = new GrayPrintBox();
		paper = new A4Paper();
		printer.print(box, paper);
	}
}
