/**
	���󣺼���Java����ʦ��н
	Java����ʦ��н=�µ�н+��ʵ�ʼ�Ч+�²Ͳ�-�±���;
	���У�
	�µ�нΪ�̶�ֵ��
	��ʵ�ʼ�Ч=�¼�Ч�������µ�н*25%��*�¹�����ɷ�������СֵΪ0�����ֵΪ150��/100��
	�²Ͳ�=��ʵ�ʹ�������*15��
	�±���Ϊ�̶�ֵ��
	
	���裺
	1.�������ʼֵ
	2.���û���������ʾ����
	3.���
*/
import java.util.Scanner;
class CalSalary{
	public static void main(String[] args){
		double engSalary = 0.0;//Java����ʦ��н
		int basSalary = 10000;//�µ�н
		int comResult = 100;
		double workDay = 22;
		double insurance = basSalary*0.105;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������Java����ʦ��н��");
		basSalary = input.nextInt();
		System.out.print("������Java����ʦ�¹�����ɷ�������СֵΪ0�����ֵΪ150����");
		comResult = input.nextInt();
		System.out.print("������Java����ʦʵ�ʹ���������");
		workDay = input.nextDouble();
		System.out.print("������Java����ʦ��Ӧ�۱�������");
		insurance = input.nextDouble();
		
		engSalary = basSalary + basSalary*0.25*comResult/100 + 15*workDay + insurance;
		System.out.println("java����ʦ��нΪ��"+engSalary);
		
	}
}