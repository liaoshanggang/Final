/**
����
��������ϵͳ�п��Դ��10��Java����ʦ��Ϣ��������Ҫ�ֱ�������10��Java����ʦ�ĵ�н��
�������н���ڵ���6000�ĸ�н��Ա�����Լ���Щ��н��Ա�ĵ�нƽ��ֵ��
˼·��
*/
import java.util.Scanner;
class TestFor4{
	public static void main(String[] args){
		int highNum = 0;
		int sumBasSalary = 0;
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"������ʦ�ĵ�н��");
			int basSalary = input.nextInt();
			if(basSalary>=6000){
				highNum = highNum + 1;
				sumBasSalary = sumBasSalary + basSalary;
			}
		}
		System.out.println("10��Java����ʦ�У���н��Ա����Ϊ��"+highNum/10.0*100+"%");
		System.out.println("��н��Աƽ����нΪ��"+sumBasSalary/highNum);
	}
}