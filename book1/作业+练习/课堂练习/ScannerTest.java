/*1������  һ  ��������������������1��5���
    �Ľ����Ҫ���ʽ���£�

������һ��������** ����5

1*���������=���
2*���������=���
����
5*���������=���

1*5=5
2*5=10
3*5=15

2,����������double���͵����ݣ��������ǵĺͣ�����ֻ���������������֣�

3.����һ��������������n��Сʱ��
  ����n��Сʱ���ڶ���������ٸ�Сʱ��
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
		  System.out.print("����������double���͵�����:");
		  a = input.nextDouble();
		  b = input.nextDouble();
		  c = input.nextDouble();
		  sum = a+b+c;
		  System.out.println("��Ϊ��"+sum);
		  
		  System.out.print("������һ��������");
		  int intNum = input.nextInt();
		  int day = 0;
		  int hour = 0;
		  day = intNum/24;
		  //hour = 
		  
		  
	  }
  }