import java.util.Scanner;
/*class TestSwitch 
{
	public static void main(String[] args) 
	{
		int score = -1;

		Scanner input = new Scanner(System.in);
		System.out.print("请输入张明的美术学习班结业评价（只能输入1、2、3、4）：");
		score = input.nextInt();

		switch(score){
			case 1:
				System.out.println("暑假带张明去九寨沟旅游！");
				break;
			case 2:
				System.out.println("奖励一个变形金刚！");
				break;
			case 3:
				System.out.println("不奖不罚，需要继续努力！");
				break;
			case 4:
				System.out.println("负责家里洗碗一周！");
				break;
			default:
				System.out.println("输入错误，请重新输入！");
				break;
		}

	}
}
*/
/**
需求：
变为 如果学习班结业评价是1等或者2等，则会”“;
	如果学习班结业评价是3等或者4等，则会”“；
*/
class TestSwitch2 
{
	public static void main(String[] args) 
	{
		int score = -1;

		Scanner input = new Scanner(System.in);
		System.out.print("请输入张明的美术学习班结业评价（只能输入1、2、3、4）：");
		score = input.nextInt();

		switch(score){
			case 1:
			case 2:
				System.out.println("暑假带张明去九寨沟旅游！");
				break;
			case 3:
			case 4:
				System.out.println("不奖不罚，需要继续努力！");
				break;
			default:
				System.out.println("输入错误，请重新输入！");
				break;
		}

	}
}