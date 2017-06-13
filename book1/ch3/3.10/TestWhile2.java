/**
需求：程序的主界面：
	1.输入数据
	2.输出数据
	3.退出程序
	请选择你的输入（只能输入1、2、3）:

	步骤1：输出主界面
			提示用户选择
*/
import java.util.Scanner;
class TestWhile2
{
	public static void main(String[] args){
		int userSel = -1;
		while(true){
			System.out.println("------------------------------");
			System.out.println("1.输入数据");
			System.out.println("2.输出数据");
			System.out.println("3.退出程序");
			System.out.println("------------------------------");
			System.out.print("请选择你的输入（只能输入1、2、3）:");
			Scanner input = new Scanner(System.in);
			userSel = input.nextInt();
			switch(userSel){
				case 1:
					System.out.println("执行1.输入数据");
					System.out.println("**************\n");
					break;
				case 2:
					System.out.println("执行2.输出数据");
					System.out.println("**************");
					System.out.println("**************\n");
					break;
				case 3:
					System.out.println("结束程序！\n");
					break;
				default:
					System.out.println("输入的数据不正确！\n");
					break;
			}
			if(userSel==3){
				break;
			}
		}
	}
}
