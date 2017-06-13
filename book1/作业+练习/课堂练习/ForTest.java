/*从键盘输入一个数：
输出如下形式:
	5+1=6
	4+2=6
	.....
	.....
	1+5=6
*/
import java.util.Scanner;
class ForTest{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("输入一个数：");
		int num = in.nextInt();
		for(int i=1;i<=5;i++){
			System.out.println((num-i+1)+"+"+i+"="+(num+1));
		}
	}
}