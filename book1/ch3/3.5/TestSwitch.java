import java.util.Scanner;
/*class TestSwitch 
{
	public static void main(String[] args) 
	{
		int score = -1;

		Scanner input = new Scanner(System.in);
		System.out.print("����������������ѧϰ���ҵ���ۣ�ֻ������1��2��3��4����");
		score = input.nextInt();

		switch(score){
			case 1:
				System.out.println("��ٴ�����ȥ��կ�����Σ�");
				break;
			case 2:
				System.out.println("����һ�����ν�գ�");
				break;
			case 3:
				System.out.println("������������Ҫ����Ŭ����");
				break;
			case 4:
				System.out.println("�������ϴ��һ�ܣ�");
				break;
			default:
				System.out.println("����������������룡");
				break;
		}

	}
}
*/
/**
����
��Ϊ ���ѧϰ���ҵ������1�Ȼ���2�ȣ���ᡱ��;
	���ѧϰ���ҵ������3�Ȼ���4�ȣ���ᡱ����
*/
class TestSwitch2 
{
	public static void main(String[] args) 
	{
		int score = -1;

		Scanner input = new Scanner(System.in);
		System.out.print("����������������ѧϰ���ҵ���ۣ�ֻ������1��2��3��4����");
		score = input.nextInt();

		switch(score){
			case 1:
			case 2:
				System.out.println("��ٴ�����ȥ��կ�����Σ�");
				break;
			case 3:
			case 4:
				System.out.println("������������Ҫ����Ŭ����");
				break;
			default:
				System.out.println("����������������룡");
				break;
		}

	}
}