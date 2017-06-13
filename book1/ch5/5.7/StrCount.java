import java.util.Scanner;
class StrCount{
	public static void main(String[] args){
		int count = 0;
		int start = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你一个字符串：");
		String str = input.next();
		System.out.print("请输入要查找的字符串：");
		String str1 = input.next();
		while(str.indexOf(str1,start)>=0&&start<str.length()){
			count++;
			start = str.indexOf(str1,start) + str1.length();
		}
		System.out.println(str1+"在"+str+"出现的次数为"+count);
	}
}