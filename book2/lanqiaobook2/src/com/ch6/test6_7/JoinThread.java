package com.ch6.test6_7;

public class JoinThread {
	public static void main(String[] args) {
		SThread st = new SThread();
		QThread qt = new QThread(st);
		qt.start();
		st.start();
		
	}
}
