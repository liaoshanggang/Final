/*
1.?��ӡ����Ч��?

***********************?
* ??hello,world     *
***********************

2.?�����¶Ⱥ������¶Ȼ���ת����
�ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9
�����ˣ�
�����϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�

3.��֪a,b�������ͱ��������õ�������������ab����������ֵ������

4.����һ������ĸ�����������3.123456789����������λС������������������롣

5.����һ�������5λ������������������λ�������������롣

6.����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��

7.ʹ��XMIND������һ�£��ڶ��º͵����µ�֪ʶ˼ά��ͼ������֪ʶ���������
����ȫ���֪ʶ��ϵ��
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
		System.out.print("�����¶�hsTΪ:");
		hsT = in.nextInt();
		ssT = (hsT-32)*5/9;
		hsT = ssT*9/5+32;
		System.out.println("�����¶�ת��Ϊ�����¶�Ϊ��"+ssT+"���϶�ת�ɻ��϶�Ϊ��"+hsT);
	}
	public static void exchangeVar(){
		int a,b;
		System.out.println("������2��Ҫ����������");
		System.out.print("������a��ֵ��");
		a = in.nextInt();
		System.out.print("������b��ֵ��");
		b = in.nextInt();
		a = a + b;//��һ
		b = a - b;
		a = a - b;
		System.out.println("�������ֵΪ��a="+a+" b="+b);
		
		// a = a ^ b;//����
		// b = a ^ b;
		// a = a ^ b;
		// System.out.println("�������ֵΪ��a="+a+" b="+b);
		
	}
	public static void testTask4(){
		System.out.print("������һ������ĸ�������");
		double dDig = in.nextDouble();
		dDig = (int)(dDig*100)/100.0;
		System.out.println("�ø�������������λС�����Ϊ��"+dDig);
	}
	public static  void testTask5(){
		System.out.print("������һ�������5λ������");
		int intDigi = in.nextInt();
		intDigi = intDigi/100*100;
		System.out.println("��������λ��5λ��Ϊ��"+intDigi);
	}
	public static void testTask6(){
		char cXiaoXie;
		System.out.print("������һ������Ĵ�д��ĸA~Z:");
		char cDaXie = in.next().charAt(0);
		cXiaoXie = (char)(cDaXie + 32);
		System.out.print("cXiaoXie:"+cXiaoXie);
	}
}