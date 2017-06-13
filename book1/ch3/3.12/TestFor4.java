/**
需求：
假设蓝桥系统中可以存放10个Java工程师信息，现在需要分别输入这10个Java工程师的底薪，
并计算底薪大于等于6000的高薪人员比例以及这些高薪人员的底薪平均值。
思路：
*/
import java.util.Scanner;
class TestFor4{
	public static void main(String[] args){
		int highNum = 0;
		int sumBasSalary = 0;
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"个工程师的底薪：");
			int basSalary = input.nextInt();
			if(basSalary>=6000){
				highNum = highNum + 1;
				sumBasSalary = sumBasSalary + basSalary;
			}
		}
		System.out.println("10个Java工程师中，高薪人员比例为："+highNum/10.0*100+"%");
		System.out.println("高薪人员平均底薪为："+sumBasSalary/highNum);
	}
}