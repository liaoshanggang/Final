package com.ch1.test1_6;

import java.util.Scanner;

public class TestEx5 {
	public static void main(String[] args) {
		try {
			String teachers[] = { "����", "�e��", "���ٶ�" };
			for (int i = 0; i < 4; i++) {
				System.out.println(teachers[i]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���M��Խ�磬Ո�޸ĳ���");
		}
		System.out.println("�@ʾ�ꮅ��");
	}
}
