import java.util.Scanner;
class IfTest{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("please input your score:");
		double score = in.nextDouble();
		if(score>100&&score<0){
			System.out.println("your data is wrong!");
		}else if(score<60){
			System.out.println("不及格");
		}else if(score>=60&&score<70){
			System.out.println("及格");
		}else if(score>=70&&score<80){
			System.out.println("中");
		}else if(score>=80&&score<90){
			System.out.println("良");
		}else if(score>=90){
			System.out.println("优秀！");
		}
	}
}