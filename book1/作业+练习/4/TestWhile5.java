/* 5��ѭ������10��������ͳ����10���������ж��ٸ�ż�� */
import java.util.Scanner;
class TestWhile5{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = 0;
		int i = 1;
		int j = 0;//����
		while(i<=10){
			System.out.print("�������"+i+"��������");
			num = in.nextInt();
			if(num%2==0){
				j++;
			}
			i++;
		}
		System.out.print("ѭ������10����������10����������"+j+"��ż��");
	}
}