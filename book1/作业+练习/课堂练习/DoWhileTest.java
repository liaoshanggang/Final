/*
���ԣ�����ɼ����ڵ���60�����񣬷��򣬼�������
*/
import java.util.Scanner;
class DoWhileTest{
	public static void main(String[] args){
		double score;
		Scanner in = new Scanner(System.in);
		do{
			System.out.println("����");
			System.out.print("�����뿼�Գɼ���");
			score = in.nextDouble();
		}while(score<60);
		System.out.println("���ڼ�����");
	}
}