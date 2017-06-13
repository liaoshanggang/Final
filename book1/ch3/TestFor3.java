class TestFor3{
	public static void main(String[] args){
		int sum = 0;
		for(int i=1;i<=1000;i=i+2){
			sum = sum + i;
		}
		System.out.println("1~1000之间所有的奇数的和为："+sum);
	}
}