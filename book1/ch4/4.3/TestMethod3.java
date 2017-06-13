import java.util.Scanner;
class TestMethod3{
	static int userSel = -1;
	public static void main(String[] args){
		while(true){
			userSel = showMenu();
			switch(userSel){
				case 1:
					inputData();break;
				case 2:
					outputData();break;
				case 3:
					System.out.println("结束程序!");break;
				default:
					System.out.println("输入数据不正确!");break;
			}
			if(userSel==3){
				break;
			}
		}
	}
	//显示程序主界面，返回用户输入的功能菜单数
	public static int showMenu(){
		System.out.println("1.输入数据");
		System.out.println("2.输出数据");
		System.out.println("3.退出程序");
		Scanner input = new Scanner(System.in);
		System.out.print("请选择你的输入（只能输入1，2，3）:");
		userSel = input.nextInt();
		return userSel;
	}
	//完成输入数据的功能
	public static void inputData(){
		System.out.println("执行1.输入数据模块");
		System.out.println("******************");
		System.out.println("******************");
	}
	//完成输出数据的功能
	public static void outputData(){
		System.out.println("执行2.输入数据模块");
		System.out.println("******************");
		System.out.println("******************");
	}
}