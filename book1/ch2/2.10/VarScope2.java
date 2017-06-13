class VarScope2{
	float varT = 9.1F;
	
	public void show(){
		float varT = 1.1F;
		System.out.println("varT ="+varT);
		//float varT = 12.3F; //不可以在同一个作用域内，定义两个同名变量
	}
	public static void main(String[] args){
		VarScope2 v2 = new VarScope2();
		v2.show();
	}
}