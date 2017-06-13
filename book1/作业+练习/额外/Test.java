/*2.随意输入三个整数，按照从大到小的次序，把结果输出在控制台。*/
import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入第一个整数：");
		int num1 = in.nextInt();
		System.out.print("请输入第二个整数：");
		int num2 = in.nextInt();
		System.out.print("请输入第三个整数：");
		int num3 = in.nextInt();
		if(num1>num2){
			System.out.println("num 1 = "+num1);
		}else if(num1>num3){
			System.out.println("num 2 = "+num2);	
		}else{
			System.out.println("num 3 = "+num3);
		}
		
	}
}