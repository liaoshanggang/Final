/*2.���������������������մӴ�С�Ĵ��򣬰ѽ������ڿ���̨��*/
import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�������һ��������");
		int num1 = in.nextInt();
		System.out.print("������ڶ���������");
		int num2 = in.nextInt();
		System.out.print("�����������������");
		int num3 = in.nextInt();
		if(num1>num2){
			System.out.println("num 1 = "+num1);
		}else if(num1>num3){
			System.out.println("num 2 = "+num2);	
		}else{
			System.out.println("num 3 = "+num3);
		}
		
	}
}