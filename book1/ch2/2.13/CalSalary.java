/**
	需求：计算Java工程师月薪
	Java工程师月薪=月底薪+月实际绩效+月餐补-月保险;
	其中：
	月底薪为固定值。
	月实际绩效=月绩效基数（月底薪*25%）*月工作完成分数（最小值为0，最大值为150）/100。
	月餐补=月实际工作天数*15。
	月保险为固定值。
	
	步骤：
	1.定义各初始值
	2.与用户交互，提示输入
	3.输出
*/
import java.util.Scanner;
class CalSalary{
	public static void main(String[] args){
		double engSalary = 0.0;//Java工程师月薪
		int basSalary = 10000;//月底薪
		int comResult = 100;
		double workDay = 22;
		double insurance = basSalary*0.105;
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入Java工程师底薪：");
		basSalary = input.nextInt();
		System.out.print("请输入Java工程师月工作完成分数（最小值为0，最大值为150）：");
		comResult = input.nextInt();
		System.out.print("请输入Java工程师实际工作天数：");
		workDay = input.nextDouble();
		System.out.print("请输入Java工程师月应扣保险数：");
		insurance = input.nextDouble();
		
		engSalary = basSalary + basSalary*0.25*comResult/100 + 15*workDay + insurance;
		System.out.println("java工程师月薪为："+engSalary);
		
	}
}