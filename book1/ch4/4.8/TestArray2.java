class TestArray2{
	public static void main(String[] args){
		int engNo1 = 1001;
		int engNo2 = 1002;
		System.out.println("ֵ���ݽ�����ֵ��");
		System.out.println("����ǰ����ʦ1������ʦ2���Ϊ��"+engNo1+"\t"+engNo2);
		exchange1(engNo1,engNo2);
		System.out.println("���ú󹤳�ʦ1������ʦ2���Ϊ��"+engNo1+"\t"+engNo2);
		
		int[] engNo = new int[2];
		engNo[0] = 1001;
		engNo[1] = 1002;
		System.out.println("���ô��ݽ�����ֵ��");
		System.out.println("����ǰ����ʦ1������ʦ2���Ϊ��"+engNo[0]+"\t"+engNo[1]);
		exchange2(engNo);
		System.out.println("���ú󹤳�ʦ1������ʦ2���Ϊ��"+engNo[0]+"\t"+engNo[1]);
	}
	
	public static void exchange1(int a,int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void exchange2(int[] x){
		int temp = x[0];
		x[0] = x[1];
		x[1] = temp;
	}
}