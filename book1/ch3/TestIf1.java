import java.util.Scanner;
class TestIf1
{
	public static void main(String[] args){
		int javaScore = -1;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入王云同学Java考试成绩：");
		javaScore = input.nextInt();
		System.out.println(javaScore>=60?("恭喜你，考试合格"):("很难过地通知你：考试不及格，需要补考！"));
	}
}