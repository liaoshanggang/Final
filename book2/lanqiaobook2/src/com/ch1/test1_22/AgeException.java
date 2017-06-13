package com.ch1.test1_22;

public class AgeException extends Exception {
	private String message;
	public AgeException(int age){
		message = "年齡設置為："+age+"不合理！";
	}
	public String toString(){
		return message;
	}
}
