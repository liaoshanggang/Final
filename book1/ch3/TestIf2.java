import java.util.Scanner;
class TestIf2
{
	public static void main(String[] args){
		int javaScore = -1;
		int webScore = -1;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入王云同学Java考试成绩：");
		javaScore = input.nextInt();
		System.out.print("请输入王云同学Web考试成绩：");
		webScore = input.nextInt();
		if(javaScore>=60&&webScore>=60){
			System.out.println("恭喜你，获得Java初级工程师认证！");
		}else{
			System.out.println("你有考试不及格，需要补考！");
		}
	}
}