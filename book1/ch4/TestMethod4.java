/**
需求：使用递归调用计算整数n的阶乘
*/
class TestMethod4{
	public static void main(String[] args){
		System.out.println(factorial(5));
	}
	
	static long factorial(int n){
		if(n==1){
			return 1;
		}
		long sum = factorial(n-1);
		return sum*n;
	}
}