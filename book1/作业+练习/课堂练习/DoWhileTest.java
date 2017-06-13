/*
考试，如果成绩大于等于60，及格，否则，继续考试
*/
import java.util.Scanner;
class DoWhileTest{
	public static void main(String[] args){
		double score;
		Scanner in = new Scanner(System.in);
		do{
			System.out.println("考试");
			System.out.print("请输入考试成绩：");
			score = in.nextDouble();
		}while(score<60);
		System.out.println("终于及格了");
	}
}