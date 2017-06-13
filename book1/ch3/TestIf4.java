/**
需求：王云同学的Java考试成绩为x,则按以下要求输出结果。
x>=85,则输出"恭喜你，成绩优秀！"。
85>x>=70,则输出"恭喜你，成绩良好！"。
70>x>=60,则输出"恭喜你，成绩合格！"。
60>x,则输出"很抱歉，成绩不合格！"。
*/
import java.util.Scanner;
class TestIf4
{
	public static void main(String[] args){
		int javaScore = -1;
		int webScore = -1;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入王云同学Java考试成绩：");
		javaScore = input.nextInt();
		if(javaScore>=85){
			System.out.println("恭喜你，成绩优秀！");
		}else if(javaScore>70){
			System.out.println("恭喜你，成绩良好！");
		}else if(javaScore>60){
			System.out.println("恭喜你，成绩合格！");
		}else{
			System.out.println("恭喜你，成绩不合格！");
		}
	}
}