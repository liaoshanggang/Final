/**
����
	���û�������ȷ�ĳ�������֮�󣬲ſ���ִ������Ĵ��룬����������û����룬ֱ��������ȷΪֹ��
*/
import java.util.Scanner;
class TestWhile3 
{
	public static void main(String[] args) 
	{
		String userPass = "";
		final String PASSWORD = "123456";
		do{
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ���������������룺");
		userPass = input.nextLine();//
		}while(!userPass.equals(PASSWORD));
		System.out.println("����������ȷ������ִ�У�");
	}
}
