package com.ch6.test6_5;

import java.util.Scanner;

public class EndingThread {
	public static void main(String[] args) {
		CountThread t = new CountThread();
		t.start();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ֹ��������̣߳�������s");
		while (true) {
			String s = scanner.nextLine();
			if (s.equals("s")) {
				t.stopIt();
				break;
			}
		}
	}
}
