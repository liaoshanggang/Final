/**
��������10��Java����ʦ�ĵ���
����10��Java����ʦ�ĵ�н���������н���ڵ���6000�ĸ�����Ա�����Լ���Щ������Ա�ĵ�нƽ��ֵ
*/
import java.util.Scanner;
class TestArray1{
	public static void main(String[] args){
		int hightNum = 0;//��н���ڵ���6000��Java����ʦ����
		int sumBasSalary = 0;//������Ա��н�ܺ�
		
		int[] balSalary = new int[10];
		
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"������ʦ�ĵ�нΪ��");
			balSalary[i-1] = input.nextInt();
			if(balSalary[i-1]>=6000){
				sumBasSalary = sumBasSalary + balSalary[i-1];
					hightNum = hightNum + 1;
			}
		}
		
		System.out.println("10��Java����ʦ�У�������Ա����Ϊ��"+hightNum/10.0*100+"%");
		System.out.println("��Щ������Ա��ƽ����нΪ��"+sumBasSalary/hightNum);
		
		System.out.print("����������Ҫ��ȡ�ڼ�������ʦ�ĵ�н��");
		int index = input.nextInt();
		System.out.println("��"+index+"������ʦ�ĵ�нΪ��"+balSalary[index-1]);
	}
}