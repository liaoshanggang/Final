import java.util.Scanner;
class TestIf2
{
	public static void main(String[] args){
		int javaScore = -1;
		int webScore = -1;
		Scanner input = new Scanner(System.in);
		System.out.print("����������ͬѧJava���Գɼ���");
		javaScore = input.nextInt();
		System.out.print("����������ͬѧWeb���Գɼ���");
		webScore = input.nextInt();
		if(javaScore>=60&&webScore>=60){
			System.out.println("��ϲ�㣬���Java��������ʦ��֤��");
		}else{
			System.out.println("���п��Բ�������Ҫ������");
		}
	}
}