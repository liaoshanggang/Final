/**
������������һ���������������ֵ����˷���
�磺������һ��������8
	��8�ĳ˷���Ϊ��
	0*8=0
	1*7=7
	2*6=12
	.....
	8*0=0
*/
import java.util.Scanner;
class TestFor6{
	public static void main(String[] args){
		int intNum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("please input a intNum:");
		intNum = input.nextInt();
		System.out.println("the intNum is:"+intNum);
		for(int i=0,j=intNum;i<=intNum;i++,j--)
			System.out.println(i+"*"+j+"="+i*j);
	}
}