class VarScope{
	static float varQ = 9.1F;//��Ա����
	{
			int varB = 10;//����ľֲ�����
			System.out.println("varB="+varB);
			System.out.println("varQ="+varQ);
	}
	public static void main(String[] args){
			int varL = 8;//�����еľֲ�����
			System.out.println("varL="+varL);
			System.out.println("varQ="+varQ);
			//System.out.println("varB="+varB);
	}
	float varT = varQ + 1.0F;
}