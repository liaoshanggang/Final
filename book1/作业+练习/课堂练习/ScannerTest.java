/*1、输入  一  个整数，输出这个整数与1到5相乘
    的结果，要求格式如下：

请输入一个整数：** 比如5

1*输入的整数=结果
2*输入的整数=结果
……
5*输入的整数=结果

1*5=5
2*5=10
3*5=15

2,请输入三个double类型的数据，计算他们的和，但是只输出结果的整数部分；

3.输入一个整数，代表有n个小时，
  计算n个小时等于多少天零多少个小时。
  */
  import java.util.Scanner;
  class ScannerTest{
	  public static void main(String[] args){
		  int intNum;
		  Scanner input = new Scanner(System.in);
		  System.out.print("please input an interger:");
		  intNum = input.nextInt();
		  for(int i=1;i<=5;i++)
		  {
			  System.out.println(i+"*"+intNum+"="+i*intNum);
		  }
		  
		  double a,b,c,sum;
		  System.out.print("请输入三个double类型的数据:");
		  a = input.nextDouble();
		  b = input.nextDouble();
		  c = input.nextDouble();
		  sum = a+b+c;
		  System.out.println("和为："+sum);
		  
		  System.out.print("请输入一个整数：");
		  int intNum = input.nextInt();
		  int day = 0;
		  int hour = 0;
		  day = intNum/24;
		  //hour = 
		  
		  
	  }
  }