/**
����һ���̳��ڹ�������û��������������û��ͺ������
�ڿ���̨�����û����������(Integral number)x,�����û������ڿ���̨����������
x<5000,�����������ڿ��֣�����һ�źؿ�����
5000<=x<10000,�����������ڿ��֣�����һ�����ӣ���
10000<=x<30000,�����������ڿ��֣�����һ�ײ;ߣ���
x>=30000,�����������ڿ��֣�����һ�׾������ʴ�������
*/
import java.util.Scanner;
class  IfTest
{
	public static void main(String[] args) 
	{
		int x = -1;//������

		Scanner input = new Scanner(System.in);
		System.out.print("Please input your integral number:");
		x = input.nextInt();
		if(x<5000){
			System.out.println("����ڿ��֣�����һ�źؿ���");
		}else if(x>=5000&&x<10000){
			System.out.println("����ڿ��֣�����һ�����ӣ�");		
		}else if(x>=10000&&x<30000){
			System.out.println("����ڿ��֣�����һ�ײ;ߣ�");
		}else{
			System.out.println("����ڿ��֣�����һ�׾������ʴ�����");	
		}
	}
}
