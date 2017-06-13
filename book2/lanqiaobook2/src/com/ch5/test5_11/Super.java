package com.ch5.test5_11;

public class Super {
	private int supPri = 1;
	int supPac = 2;
	protected double supPro = 3;
	public String supPub = "4";
	
	public Super(){
		
	}
	public Super(int supPri, int supPac, double supPro, String supPub) {
		super();
		this.supPri = supPri;
		this.supPac = supPac;
		this.supPro = supPro;
		this.supPub = supPub;
	}
	protected Super(int supPri, int supPac, double supPro){
		this(supPri, supPac, supPro, "4");
	}
	Super(int supPri, int supPac){
		this(supPri, supPac, 3.0,"4");
	}
	private Super(int supPri){
		this(supPri, 2,3.0,"4");
	}
	
	private void supPrivate(){}
	int supPackage(){
		return supPac;
	}
	protected double supProtected(){
		return supPro;
	}
	public String supPublic(){
		return supPub;
	}

}
