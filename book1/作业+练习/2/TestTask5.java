/*
5������һ�����α�������:int a = 12345;Ȼ�������������λ�ϵ����֣�
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
		System.out.print(a+"�ĸ�λ����Ϊ:"+geWei);
		System.out.print(" ʮλ����Ϊ:"+shiWei);
		System.out.print(" ��λ����Ϊ:"+baiWei);
		System.out.print(" ǧλ����Ϊ:"+qianWei);
		System.out.println(" ��λ����Ϊ:"+waiWei);
	}
}