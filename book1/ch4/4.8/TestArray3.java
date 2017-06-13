/*
需求：
（1）计算出底薪大于等于6000的高薪人员比例以及这些高薪人员的底薪平均值。
（2）输出用户选择的某个工程师的底薪。
调整为用户输入这10个Java工程师的底薪后，对他们的底薪进行加薪，加薪标准如下：
（1）底薪大于等于6000元的高薪人员，加薪5%。
（2）非高薪人员，加薪10%。
最后输出用户选择的某个工程师加薪后的底薪。
*/
import java.util.Scanner;
class TestArray3{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		double engBalSalary[] = new double[10];
		int index = 0;
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"Java工程师的底薪:");
			engBalSalary[i-1] = input.nextDouble();
			if(engBalSalary[i-1]>=6000){
				engBalSalary[i-1] = engBalSalary[i-1] + engBalSalary[i-1]*0.05;
			}
			engBalSalary[i-1] = engBalSalary[i-1] + engBalSalary[i-1]*0.1;
		}
		System.out.print("请选择你要查询第个的底薪");
		index = input.nextInt();
		System.out.println("您选择的第"+index+"个工程师的底薪为:"+engBalSalary[index-1]);
	}
	
}