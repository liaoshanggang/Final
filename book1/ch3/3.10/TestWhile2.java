/**
���󣺳���������棺
	1.��������
	2.�������
	3.�˳�����
	��ѡ��������루ֻ������1��2��3��:

	����1�����������
			��ʾ�û�ѡ��
*/
import java.util.Scanner;
class TestWhile2
{
	public static void main(String[] args){
		int userSel = -1;
		while(true){
			System.out.println("------------------------------");
			System.out.println("1.��������");
			System.out.println("2.�������");
			System.out.println("3.�˳�����");
			System.out.println("------------------------------");
			System.out.print("��ѡ��������루ֻ������1��2��3��:");
			Scanner input = new Scanner(System.in);
			userSel = input.nextInt();
			switch(userSel){
				case 1:
					System.out.println("ִ��1.��������");
					System.out.println("**************\n");
					break;
				case 2:
					System.out.println("ִ��2.�������");
					System.out.println("**************");
					System.out.println("**************\n");
					break;
				case 3:
					System.out.println("��������\n");
					break;
				default:
					System.out.println("��������ݲ���ȷ��\n");
					break;
			}
			if(userSel==3){
				break;
			}
		}
	}
}
