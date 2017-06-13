/**
需求：
需要输出3个正三角图形，第一个图形是5行*，第二个图形是8行*，第三个图形是12行*
*/
class TestMethod1{
	public static void main(String[] args){
		//第一个图形是5行*
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//第二个图形是8行*
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