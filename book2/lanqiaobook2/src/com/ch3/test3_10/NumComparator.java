package com.ch3.test3_10;

import java.util.Comparator;

public class NumComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO 自动生成的方法存根
		Student so1 = (Student) o1;
		Student so2 = (Student) o2;
		return so1.stuNum-so2.stuNum;
	}

}
