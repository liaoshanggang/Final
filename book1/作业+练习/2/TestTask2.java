/*
	2、定义一个变量记录硬盘的大小，如1GB,那么计算这个硬盘有多少MB。
	有多少KB。有多少Byte。
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
		System.out.print("请输入硬盘的大小(单位GB)：");
		gbV = in.nextInt();
		long mbV = 1024*gbV;
		long kbV = 1024*mbV;
		long bV = 1024*kbV;
		System.out.println(gbV+"GB大小的硬盘有:"+mbV+"MB "+kbV+"KB "+bV+"Byte");
	}
}
