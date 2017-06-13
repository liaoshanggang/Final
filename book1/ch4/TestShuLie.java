/*
需求：有一个分数序列：2/1,3/2,5/3,8/5,13/8,21/13,求出这个数列的前20项之和。
	思路：（1）从序列中可以看出规律，后一个分数的分子是前一个分数分子与分母之和，后一个分数的分母是前一个分数的分子。
	（2）声明一个长度为21的整形数组a,前20个整数用于存放这个序列前20项的分母，第21个整数用于存放这个序列第20项的分子，a[0]=1;a[1]=2;a[2]=a[0]+a[1].
	（3）第i项的分数为a[i]/a[i-1](需要强制转换成double类型).
*/

class TestShuLie{
	public static void main(String[] args){
		double sum = 0;
		int a[] = new int[20];
		a[0] = 1;
		a[1] = 2;
		
		for(int i=2;i<20;i++){
			a[i] = a[i-1] + a[i-2];
		}
		for(int i=1;i<20;i++){
			sum = sum + (double)a[i]/a[i-1];
		}
		System.out.println(sum);
	}
	
}