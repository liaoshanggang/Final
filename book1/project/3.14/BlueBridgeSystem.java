import java.util.Scanner;
public class BlueBridgeSystem{
	public static void main(String[] args){
		while(true){
			System.out.println("-------------------------------------------------------");
			System.out.println("|                蓝桥计划Java工程师管理系统           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("1.输入Java工程师资料");
			System.out.println("2.删除指定Java工程师资料");
			System.out.println("3.查询Java工程师资料");
			System.out.println("4.修改Java工程师资料");
			System.out.println("5.计算Java工程师资料");
			System.out.println("6.保存新添加的工程师资料");
			System.out.println("7.对Java工程师信息排序（1编号升序，2姓名升序）");
			System.out.println("8.输出所有Java工程师信息");
			System.out.println("9.清空所有Java工程师数据");
			System.out.println("10.打印Java工程师数据报表");
			System.out.println("11.从文件重新导入Java工程师数据");
			System.out.println("0.结束（编辑工程师信息后提示保存）");
			Scanner input = new Scanner(System.in);
			System.out.print("请输入您的选择：");
			int yourChoice = input.nextInt(); 
			switch(yourChoice){
				case 0:
					System.out.println("程序结束!");
					break;
				case 1:
					System.out.println("本模块未实现");
					break;
				case 2:
					System.out.println("本模块未实现");
					break;
				case 3:
					System.out.println("本模块未实现");
					break;
				case 4:
					System.out.println("本模块未实现");
					break;
				case 5:
					subFun5();
					break;
				case 6:
					System.out.println("本模块未实现");
					break;
				case 7:
					System.out.println("本模块未实现");
					break;
				case 8:
					System.out.println("本模块未实现");
					break;
				case 9:
					System.out.println("本模块未实现");
					break;
				case 10:
					System.out.println("本模块未实现");
					break;
				case 11:
					System.out.println("本模块未实现");	
			}
			if(yourChoice==0){
				break;
			}
		}
	}
	public static void subFun5(){
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