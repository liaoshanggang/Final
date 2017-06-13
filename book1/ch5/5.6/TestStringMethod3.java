import java.util.Scanner;
public class TestStringMethod3{
	public static void main(String[] args){
		String result = String.valueOf(100);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你去年一年的薪水总和：");
		int lastSalary = input.nextInt();
		String strResult = String.valueOf(lastSalary);
		System.out.println("您去年一年的薪水的总和是："+strResult.length()+"位数！");
		String date = " ,May,F,1976";
		String[] splitStr = date.split(",");
		System.out.println("Mary,F,1976使用，分隔后的结果：");
		for(int i=0;i<splitStr.length;i++){
			System.out.println("==="+splitStr[i]+"===");
		}
	}
}