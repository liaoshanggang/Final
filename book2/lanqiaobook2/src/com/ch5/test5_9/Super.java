package com.ch5.test5_9;

public class Super {
	private int superPri = 1;
	int superPac = 2;
	protected double superPro = 3;
	public String superPub = "4";
	public Super() {
		// TODO 自动生成的构造函数存根
	}
	public Super(int superPri, int superPac, double superPro, String superPub) {
		this.superPri = superPri;
		this.superPac = superPac;
		this.superPro = superPro;
		this.superPub = superPub;
	}
	protected Super(int superPri, int superPac, double superPro) {
		this(superPri, superPac, superPro, "4");
	}
	Super(int superPri, int superPac ) {
		this(superPri, superPac, 3, "4");
	}
	private Super(int superPri) {
		this(superPri, 2, 3, "14");
	}
}
