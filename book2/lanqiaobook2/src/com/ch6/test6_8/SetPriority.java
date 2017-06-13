package com.ch6.test6_8;

public class SetPriority {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		QThread qt = new QThread();
		SThread st = new SThread();
		qt.setPriority(Thread.MIN_PRIORITY);
		st.setPriority(Thread.MAX_PRIORITY);
		qt.start();
		st.start();
	}

}
