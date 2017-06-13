/**
需求：输出正三角。
*/
class TestFor2{
	public static void main(String[] args){
		for(int i=0;i<20;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}