import java.util.Scanner;
class ShareApple 
{
	public static void main(String[] args) 
	{
		int appleNum = 0;
		int stuNum = -1;
		double stuApple = -1;
		Scanner input = new Scanner(System.in);
		System.out.print("�������������м���ƻ����");
		appleNum = input.nextInt();
		System.out.print("�������������м���С���ѣ�");
		stuNum = input.nextInt();
		stuApple = appleNum/stuNum;
		System.out.print("ÿ��С���ѵõ���"+stuApple+"��ƻ��");
	}
}
