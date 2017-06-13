import java.util.Scanner;
class ShareApple 
{
	public static void main(String[] args) 
	{
		int appleNum = 0;
		int stuNum = -1;
		double stuApple = -1;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入篮子里有几个苹果：");
		appleNum = input.nextInt();
		System.out.print("请输入屋子里有几个小朋友：");
		stuNum = input.nextInt();
		stuApple = appleNum/stuNum;
		System.out.print("每个小朋友得到："+stuApple+"个苹果");
	}
}
