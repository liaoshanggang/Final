/*
	2������һ��������¼Ӳ�̵Ĵ�С����1GB,��ô�������Ӳ���ж���MB��
	�ж���KB���ж���Byte��
	GB	MB	KB	Byte
	1	1024	****	****
*/
import java.util.Scanner;
class TestTask2 
{
	public static void main(String[] args) 
	{	
		int gbV;
		Scanner in = new Scanner(System.in);
		System.out.print("������Ӳ�̵Ĵ�С(��λGB)��");
		gbV = in.nextInt();
		long mbV = 1024*gbV;
		long kbV = 1024*mbV;
		long bV = 1024*kbV;
		System.out.println(gbV+"GB��С��Ӳ����:"+mbV+"MB "+kbV+"KB "+bV+"Byte");
	}
}
