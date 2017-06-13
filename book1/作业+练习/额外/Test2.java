/*   
题目：从控制台输入用户名和密码，如果用户名和密码正确，提示登录成功，
否则提示用户名错误，或者密码错误，请重新登录。
*/ 
import java.util.Scanner;
class Test2_4{
	public static void main(String[] args){
		String user = "";
		String pwd = "";
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		while(!flag){
			System.out.print("请输入用户名:");
			user = input.next();
			System.out.print("请输入密码：");
			pwd = input.next();
			if(user.equals("李四")&&pwd.equals("123")){
				System.out.println("登陆成功");
				flag = true;
			}else{
				System.out.println("用户名错误，或者密码错误，请重新登录");
				flag = false;
			}
		}		
	}
}
/*题目：求1+2!+3!+...+20!的和。*/
class Test2_3{
	public static void main(String[] args){
		double sum = 0;
		double xiang = 1;
		for(double i=1;i<=20;i++){
			xiang = xiang*i;
			sum = sum + xiang;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}

/*  题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。 
程序分析：请抓住分子与分母的变化规律。
*/
class Test2_2{
	public static void main(String[] args){
		double a = 1;
		double b = 2;
		double c = 0;
		double sum = 0;
		double temp = 0;
		for(int i=1;i<=20;i++){
			c = b/a;
			temp = b;
			b = a+b;
			a = temp;
			sum = sum +c;
		}
		System.out.println("分数序列：2/1，3/2，5/3，8/5...前20项之和:为："+sum);
	}
}

/*  题目：实现一个可以执行加减乘除的简单的计算器。
思路：可以用switch 或者 if，if-else语句实现
 */
class Test2_1{
	public static void main(String[] args){
		double oper1 = 0;
		double oper2 = 0;	
		double result = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入操作数1：");
		oper1 = input.nextDouble();
		System.out.print("请输入操作数2：");
		oper2 = input.nextDouble();
		System.out.print("请输入要计算的运算符：");
		char ch = input.next().charAt(0);
		switch(ch){
		case '+':
			result = oper1 + oper2;
			break;
		case '-':
			result = oper1 - oper2;
			break;
		case '*':
			result = oper1 * oper2;
			break;
		case '/':
			result = oper1 / oper2;
			break;
		}
		System.out.println(oper1+" "+ch+" "+oper2+"="+result);
	}
}

class Test2{
	 /* 题目：
		打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
		例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。   
		程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
	*/
	public static void main(String[] args){
		int geWei = 0;
		int shiWei = 0;
		int baiWei = 0;

		for(int i=100;i<999;i++){
			geWei = i%10;
			shiWei = i%100/10;
			baiWei = i/100;
			if((geWei*geWei*geWei+shiWei*shiWei*shiWei+baiWei*baiWei*baiWei)==i){
				System.out.print(i+" ");
			}
		}
	}
}
 

 