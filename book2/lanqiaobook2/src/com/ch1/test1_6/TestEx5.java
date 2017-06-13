package com.ch1.test1_6;

import java.util.Scanner;

public class TestEx5 {
	public static void main(String[] args) {
		try {
			String teachers[] = { "劉海", "積分", "加速度" };
			for (int i = 0; i < 4; i++) {
				System.out.println(teachers[i]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("數組下標越界，請修改程序！");
		}
		System.out.println("顯示完畢！");
	}
}
