/*
	3、定义两个变量，a=6.89;b=8.9;现在编程实现a与b变量中的值交换，
	最后输出a与b中的值。
*/
class TestTask3
{
	public static void main(String[] args){
	
		double a = 6.89;
		double b = 8.9;
		
		double temp;//第三方变量，用来存放交换的数据
		temp = a;
		a = b;
		b = temp;
	
		System.out.println("a="+a+" b="+b);
	}
}