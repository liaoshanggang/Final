/*
����
��1���������н���ڵ���6000�ĸ�н��Ա�����Լ���Щ��н��Ա�ĵ�нƽ��ֵ��
��2������û�ѡ���ĳ������ʦ�ĵ�н��
����Ϊ�û�������10��Java����ʦ�ĵ�н�󣬶����ǵĵ�н���м�н����н��׼���£�
��1����н���ڵ���6000Ԫ�ĸ�н��Ա����н5%��
��2���Ǹ�н��Ա����н10%��
�������û�ѡ���ĳ������ʦ��н��ĵ�н��
*/
import java.util.Scanner;
class TestArray3{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		double engBalSalary[] = new double[10];
		int index = 0;
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"Java����ʦ�ĵ�н:");
			engBalSalary[i-1] = input.nextDouble();
			if(engBalSalary[i-1]>=6000){
				engBalSalary[i-1] = engBalSalary[i-1] + engBalSalary[i-1]*0.05;
			}
			engBalSalary[i-1] = engBalSalary[i-1] + engBalSalary[i-1]*0.1;
		}
		System.out.print("��ѡ����Ҫ��ѯ�ڸ��ĵ�н");
		index = input.nextInt();
		System.out.println("��ѡ��ĵ�"+index+"������ʦ�ĵ�нΪ:"+engBalSalary[index-1]);
	}
	
}