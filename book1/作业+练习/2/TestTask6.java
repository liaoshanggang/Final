/*
6��ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ�
���ܹ������£�ÿ��λ�����ֶ�����5,Ȼ������4�����ֳ���10�Ժ�õ���������������֣�
�ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
*/
import java.util.Scanner;
class TestTask6
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("����λ���������ݣ�");
		int intData = in.nextInt();
		
		//1������λ���������ϵĸ���λ���
		int gW1 = intData%10;//��λ��
		int sW2 = intData/10%10;//ʮλ��
		int bW3 = intData/100%10;//��λ��
		int qW4 = intData/1000;//ǧλ��
		
		//2�������ܹ�������
		gW1 = (gW1+5)%10;
		sW2 = (sW2+5)%10;
		bW3 = (bW3+5)%10;
		qW4 = (qW4+5)%10;
		
		int temp;		//���������������������ݵ�
		temp = gW1;
		gW1 = qW4;
		qW4 = temp;
		
		temp = sW2;
		sW2 = bW3;
		bW3 = temp;
		int addPassData = gW1+sW2*10+bW3*100+qW4*1000;
		System.out.println("���ܺ������Ϊ��"+addPassData);		
	}
}