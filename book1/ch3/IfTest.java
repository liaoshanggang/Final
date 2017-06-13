/**
需求：一个商城在国庆根据用户积分数决定给用户送何种礼物，
在控制台允许用户输入积分数(Integral number)x,根据用户输入在控制台输出所送礼物。
x<5000,则输出”国庆节快乐，送您一张贺卡！“
5000<=x<10000,则输出”国庆节快乐，送你一个杯子！“
10000<=x<30000,则输出”国庆节快乐，送你一套餐具！“
x>=30000,则输出”国庆节快乐，送你一套精美骨质瓷器！“
*/
import java.util.Scanner;
class  IfTest
{
	public static void main(String[] args) 
	{
		int x = -1;//积分数

		Scanner input = new Scanner(System.in);
		System.out.print("Please input your integral number:");
		x = input.nextInt();
		if(x<5000){
			System.out.println("国庆节快乐，送您一张贺卡！");
		}else if(x>=5000&&x<10000){
			System.out.println("国庆节快乐，送你一个杯子！");		
		}else if(x>=10000&&x<30000){
			System.out.println("国庆节快乐，送你一套餐具！");
		}else{
			System.out.println("国庆节快乐，送你一套精美骨质瓷器！");	
		}
	}
}
