/**
����
��Ҫ���3��������ͼ�Σ���һ��ͼ����5��*���ڶ���ͼ����8��*��������ͼ����12��*
�������á�
*/
class TestMethod2{
	public static void main(String[] args){
		drawStar(5);
		drawStar(8);
		drawStar(12);
	}
	
	public static void drawStar(int x){
		for(int i=1;i<=x;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}