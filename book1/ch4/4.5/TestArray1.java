/**
用数组存放10个Java工程师的底新
输入10个Java工程师的底薪，计算出底薪大于等于6000的高新人员比例以及这些高新人员的底薪平均值
*/
import java.util.Scanner;
class TestArray1{
	public static void main(String[] args){
		int hightNum = 0;//底薪大于等于6000的Java工程师人数
		int sumBasSalary = 0;//高新人员底薪总和
		
		int[] balSalary = new int[10];
		
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"个工程师的底薪为：");
			balSalary[i-1] = input.nextInt();
			if(balSalary[i-1]>=6000){
				sumBasSalary = sumBasSalary + balSalary[i-1];
					hightNum = hightNum + 1;
			}
		}
		
		System.out.println("10个Java工程师中，高新人员比例为："+hightNum/10.0*100+"%");
		System.out.println("这些高新人员的平均底薪为："+sumBasSalary/hightNum);
		
		System.out.print("请输入你需要获取第几个工程师的底薪：");
		int index = input.nextInt();
		System.out.println("第"+index+"个工程师的底薪为："+balSalary[index-1]);
	}
}