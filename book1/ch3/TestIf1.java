import java.util.Scanner;
class TestIf1
{
	public static void main(String[] args){
		int javaScore = -1;
		Scanner input = new Scanner(System.in);
		System.out.print("����������ͬѧJava���Գɼ���");
		javaScore = input.nextInt();
		System.out.println(javaScore>=60?("��ϲ�㣬���Ժϸ�"):("���ѹ���֪ͨ�㣺���Բ�������Ҫ������"));
	}
}