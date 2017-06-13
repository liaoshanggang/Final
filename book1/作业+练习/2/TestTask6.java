/*
6、某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
加密规则如下：每个位上数字都加上5,然后用这4个数字除以10以后得到的余数代替该数字，
再将第一位和第四位交换，第二位和第三位交换。
*/
import java.util.Scanner;
class TestTask6
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请四位的整数数据：");
		int intData = in.nextInt();
		
		//1，把四位整数数据上的各个位求出
		int gW1 = intData%10;//个位数
		int sW2 = intData/10%10;//十位数
		int bW3 = intData/100%10;//百位数
		int qW4 = intData/1000;//千位数
		
		//2，按加密规则运算
		gW1 = (gW1+5)%10;
		sW2 = (sW2+5)%10;
		bW3 = (bW3+5)%10;
		qW4 = (qW4+5)%10;
		
		int temp;		//第三变量，用来交换数据的
		temp = gW1;
		gW1 = qW4;
		qW4 = temp;
		
		temp = sW2;
		sW2 = bW3;
		bW3 = temp;
		int addPassData = gW1+sW2*10+bW3*100+qW4*1000;
		System.out.println("加密后的数据为："+addPassData);		
	}
}