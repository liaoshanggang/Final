package com.ch5.test5_9;

public class Sub {
	private int subPri = 1;
	int subPac = 2;
	protected double subPro = 3;
	public String subPub = "4";
	public Sub() {
		// TODO 自动生成的构造函数存根
	}
	public Sub(int subPri, int subPac, double subPro, String subPub) {
		this.subPri = subPri;
		this.subPac = subPac;
		this.subPro = subPro;
		this.subPub = subPub;
	}
	protected Sub(int subPri, int subPac, double subPro) {
		this(subPri, subPac, subPro, "4");
	}
	Sub(int subPri, int subPac) {
		this(subPri, subPac, 3, "4");
	}
	private Sub(int subPri) {
		this(subPri, 2, 3, "14");
	}
}
