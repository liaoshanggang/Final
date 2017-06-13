package com.ch1.test1_22;

public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if (age <= 0 || age >= 120) {
			throw new AgeException(age);
		} else {
			this.age = age;
		}
	}

}
