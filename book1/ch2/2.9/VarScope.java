class VarScope{
	static float varQ = 9.1F;//成员变量
	{
			int varB = 10;//语句块的局部变量
			System.out.println("varB="+varB);
			System.out.println("varQ="+varQ);
	}
	public static void main(String[] args){
			int varL = 8;//方法中的局部变量
			System.out.println("varL="+varL);
			System.out.println("varQ="+varQ);
			//System.out.println("varB="+varB);
	}
	float varT = varQ + 1.0F;
}