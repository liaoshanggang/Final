package com.ch1.test1_17;

public class TestEx15 {
	public static void main(String[] args) {
		System.out.println("Now");
		try {
			System.out.println("is");
			throw new NullPointerException("the");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("time.\n");
	}
}
