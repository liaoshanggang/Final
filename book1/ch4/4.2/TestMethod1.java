/**
����
��Ҫ���3��������ͼ�Σ���һ��ͼ����5��*���ڶ���ͼ����8��*��������ͼ����12��*
*/
class TestMethod1{
	public static void main(String[] args){
		//��һ��ͼ����5��*
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//�ڶ���ͼ����8��*
		for(int i=1;i<=8;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=12;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}