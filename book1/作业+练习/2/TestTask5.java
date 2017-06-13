/*
5、定义一个整形变量比如:int a = 12345;然后依次输出各个位上的数字；
*/
class TestTask5
{
	public static void main(String[] args){
		int a = 12345;
		int geWei = a%10;
		int shiWei = a/10%10;
		int baiWei = a/100%10;
		int qianWei = a/1000%10;
		int waiWei = a/10000;
		System.out.print(a+"的个位数字为:"+geWei);
		System.out.print(" 十位数字为:"+shiWei);
		System.out.print(" 百位数字为:"+baiWei);
		System.out.print(" 千位数字为:"+qianWei);
		System.out.println(" 万位数字为:"+waiWei);
	}
}