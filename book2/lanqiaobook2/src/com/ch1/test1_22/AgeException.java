package com.ch1.test1_22;

public class AgeException extends Exception {
	private String message;
	public AgeException(int age){
		message = "���g�O�Þ飺"+age+"������";
	}
	public String toString(){
		return message;
	}
}
