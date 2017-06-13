/*
1.?打印如下效果?

***********************?
* ??hello,world     *
***********************

2.?华氏温度和摄氏温度互相转换：
从华氏度变成摄氏度你只要减去32，乘以5再除以9
就行了，
将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。

3.已知a,b均是整型变量，不用第三方变量，将ab两个变量的值互换。

4.输入一个任意的浮点数，例如3.123456789，保留其两位小数输出，无需四舍五入。

5.输入一个任意的5位整数，将它保留到百位，无需四舍五入。

6.输入一个任意的大写字母A~Z，转换为小写字母。

7.使用XMIND画出第一章，第二章和第三章的知识思维导图，方便知识点归纳整理，
建立全面的知识体系。
*/
import java.util.Scanner;
class Test
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		// printHW();
		// transHuaShe();
		// exchangeVar();
		// testTask4();
		// testTask5();
		testTask6();		
	}
	public static void printHW(){
		System.out.println("***********************");
		System.out.println("*  	  hello,world *");
		System.out.println("***********************");
	}
	
	public static void transHuaShe(){
		double hsT,ssT;
		System.out.print("华氏温度hsT为:");
		hsT = in.nextInt();
		ssT = (hsT-32)*5/9;
		hsT = ssT*9/5+32;
		System.out.println("华氏温度转换为摄氏温度为："+ssT+"摄氏度转成华氏度为："+hsT);
	}
	public static void exchangeVar(){
		int a,b;
		System.out.println("请输入2个要交换的整数");
		System.out.print("请输入a的值：");
		a = in.nextInt();
		System.out.print("请输入b的值：");
		b = in.nextInt();
		a = a + b;//法一
		b = a - b;
		a = a - b;
		System.out.println("交换后的值为：a="+a+" b="+b);
		
		// a = a ^ b;//法二
		// b = a ^ b;
		// a = a ^ b;
		// System.out.println("交换后的值为：a="+a+" b="+b);
		
	}
	public static void testTask4(){
		System.out.print("请输入一个任意的浮点数：");
		double dDig = in.nextDouble();
		dDig = (int)(dDig*100)/100.0;
		System.out.println("该浮点数保留其两位小数输出为："+dDig);
	}
	public static  void testTask5(){
		System.out.print("请输入一个任意的5位整数：");
		int intDigi = in.nextInt();
		intDigi = intDigi/100*100;
		System.out.println("保留到百位的5位数为："+intDigi);
	}
	public static void testTask6(){
		char cXiaoXie;
		System.out.print("请输入一个任意的大写字母A~Z:");
		char cDaXie = in.next().charAt(0);
		cXiaoXie = (char)(cDaXie + 32);
		System.out.print("cXiaoXie:"+cXiaoXie);
	}
}