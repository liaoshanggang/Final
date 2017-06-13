/**
需求：
需要输出3个正三角图形，第一个图形是5行*，第二个图形是8行*，第三个图形是12行*
代码重用。
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