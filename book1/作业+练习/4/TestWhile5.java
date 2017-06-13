/* 5、循环输入10个整数，统计这10个整数中有多少个偶数 */
import java.util.Scanner;
class TestWhile5{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = 0;
		int i = 1;
		int j = 0;//计数
		while(i<=10){
			System.out.print("请输入第"+i+"个整数：");
			num = in.nextInt();
			if(num%2==0){
				j++;
			}
			i++;
		}
		System.out.print("循环输入10个整数，这10个整数中有"+j+"个偶数");
	}
}