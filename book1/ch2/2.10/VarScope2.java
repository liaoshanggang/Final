class VarScope2{
	float varT = 9.1F;
	
	public void show(){
		float varT = 1.1F;
		System.out.println("varT ="+varT);
		//float varT = 12.3F; //��������ͬһ���������ڣ���������ͬ������
	}
	public static void main(String[] args){
		VarScope2 v2 = new VarScope2();
		v2.show();
	}
}