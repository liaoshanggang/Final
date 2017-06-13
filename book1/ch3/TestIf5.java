/**
需求：某小学需要从该校五、六年级学生中挑选一部分学生参加市数学竞赛，
现在对该校所有五、六年级学生进行了一次摸底考试，
根据考试成绩，大于等于80分的可以参加数学竞赛，之后再根据年级分别进入五年级组和六年级组。
*/
import java.util.Scanner;
class TestIf5
{
	public static void main(String[] args){
		int score = -1;
		int grade = 5;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入数学摸底成绩：");
		score = input.nextInt();
		if(score>=80){
			System.out.print("请输入所属年级（只能输入5或6）：");
			grade = input.nextInt();
			if(grade==5){
				System.out.println("你将参加市五年级组数学竞赛！");
			}else{
				System.out.println("你将参加市六年级组数学竞赛！");
			}
		}else{
			System.out.println("抱歉，不能参加市数学竞赛");
		}
	}
}