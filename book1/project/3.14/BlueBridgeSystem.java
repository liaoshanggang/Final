import java.util.Scanner;
public class BlueBridgeSystem{
	public static void main(String[] args){
		while(true){
			System.out.println("-------------------------------------------------------");
			System.out.println("|                ���żƻ�Java����ʦ����ϵͳ           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("1.����Java����ʦ����");
			System.out.println("2.ɾ��ָ��Java����ʦ����");
			System.out.println("3.��ѯJava����ʦ����");
			System.out.println("4.�޸�Java����ʦ����");
			System.out.println("5.����Java����ʦ����");
			System.out.println("6.��������ӵĹ���ʦ����");
			System.out.println("7.��Java����ʦ��Ϣ����1�������2��������");
			System.out.println("8.�������Java����ʦ��Ϣ");
			System.out.println("9.�������Java����ʦ����");
			System.out.println("10.��ӡJava����ʦ���ݱ���");
			System.out.println("11.���ļ����µ���Java����ʦ����");
			System.out.println("0.�������༭����ʦ��Ϣ����ʾ���棩");
			Scanner input = new Scanner(System.in);
			System.out.print("����������ѡ��");
			int yourChoice = input.nextInt(); 
			switch(yourChoice){
				case 0:
					System.out.println("�������!");
					break;
				case 1:
					System.out.println("��ģ��δʵ��");
					break;
				case 2:
					System.out.println("��ģ��δʵ��");
					break;
				case 3:
					System.out.println("��ģ��δʵ��");
					break;
				case 4:
					System.out.println("��ģ��δʵ��");
					break;
				case 5:
					subFun5();
					break;
				case 6:
					System.out.println("��ģ��δʵ��");
					break;
				case 7:
					System.out.println("��ģ��δʵ��");
					break;
				case 8:
					System.out.println("��ģ��δʵ��");
					break;
				case 9:
					System.out.println("��ģ��δʵ��");
					break;
				case 10:
					System.out.println("��ģ��δʵ��");
					break;
				case 11:
					System.out.println("��ģ��δʵ��");	
			}
			if(yourChoice==0){
				break;
			}
		}
	}
	public static void subFun5(){
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