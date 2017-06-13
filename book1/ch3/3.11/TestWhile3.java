/**
需求：
	让用户输入正确的程序密码之后，才可以执行下面的代码，否则继续让用户输入，直到输入正确为止。
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
		System.out.println("请选择你的输入程序密码：");
		userPass = input.nextLine();//
		}while(!userPass.equals(PASSWORD));
		System.out.println("程序密码正确，继续执行！");
	}
}
