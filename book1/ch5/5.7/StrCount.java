import java.util.Scanner;
class StrCount{
	public static void main(String[] args){
		int count = 0;
		int start = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("��������һ���ַ�����");
		String str = input.next();
		System.out.print("������Ҫ���ҵ��ַ�����");
		String str1 = input.next();
		while(str.indexOf(str1,start)>=0&&start<str.length()){
			count++;
			start = str.indexOf(str1,start) + str1.length();
		}
		System.out.println(str1+"��"+str+"���ֵĴ���Ϊ"+count);
	}
}