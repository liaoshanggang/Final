/**
����ĳСѧ��Ҫ�Ӹ�У�塢���꼶ѧ������ѡһ����ѧ���μ�����ѧ������
���ڶԸ�У�����塢���꼶ѧ��������һ�����׿��ԣ�
���ݿ��Գɼ������ڵ���80�ֵĿ��Բμ���ѧ������֮���ٸ����꼶�ֱ�������꼶������꼶�顣
*/
import java.util.Scanner;
class TestIf5
{
	public static void main(String[] args){
		int score = -1;
		int grade = 5;
		Scanner input = new Scanner(System.in);
		System.out.print("��������ѧ���׳ɼ���");
		score = input.nextInt();
		if(score>=80){
			System.out.print("�����������꼶��ֻ������5��6����");
			grade = input.nextInt();
			if(grade==5){
				System.out.println("�㽫�μ������꼶����ѧ������");
			}else{
				System.out.println("�㽫�μ������꼶����ѧ������");
			}
		}else{
			System.out.println("��Ǹ�����ܲμ�����ѧ����");
		}
	}
}