/**
��������ͬѧ��Java���Գɼ�Ϊx,������Ҫ����������
x>=85,�����"��ϲ�㣬�ɼ����㣡"��
85>x>=70,�����"��ϲ�㣬�ɼ����ã�"��
70>x>=60,�����"��ϲ�㣬�ɼ��ϸ�"��
60>x,�����"�ܱ�Ǹ���ɼ����ϸ�"��
*/
import java.util.Scanner;
class TestIf4
{
	public static void main(String[] args){
		int javaScore = -1;
		int webScore = -1;
		Scanner input = new Scanner(System.in);
		System.out.print("����������ͬѧJava���Գɼ���");
		javaScore = input.nextInt();
		if(javaScore>=85){
			System.out.println("��ϲ�㣬�ɼ����㣡");
		}else if(javaScore>70){
			System.out.println("��ϲ�㣬�ɼ����ã�");
		}else if(javaScore>60){
			System.out.println("��ϲ�㣬�ɼ��ϸ�");
		}else{
			System.out.println("��ϲ�㣬�ɼ����ϸ�");
		}
	}
}