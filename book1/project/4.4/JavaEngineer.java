/**
˼·��
��1����Java����ʦ��������Ϊ��Ա�������ܱ����������á�
��2��ʹ�÷�������������֯������ϵͳ���Ľṹ��ʹ�÷���ʵ����ʾ�������Լ�ʵ�ָ�ģ�鹦�ܵĴ��롣
��3��ԭ�ȡ�����Java����ʦ����н����������Ҫ�û�����Ĳ������ݣ�������������Java����ʦ���ϡ����������롣
��4���ڡ�����Java����ʦ���ϡ�ǰ��Ҫ�ж��Ƿ������룬����������������ʾ��Ϣ��
	�ڡ�����Java����ʦ����н��ǰ��Ҫ�ж��Ƿ�������Java����ʦ���ϣ����δ�����������ʾ��Ϣ������ͨ��status�������ֵ�ж�Java����ʦ�����Ƿ��Ѿ�������ϡ�
��5���ڡ�����Java����ʦ���ϡ�ʱ����Ҫ���������������������жϡ�

*/
import java.util.Scanner;
class JavaEngineer{
	static int engNo = -1;	//Java����ʦ��š���������Ų���Ϊ��ֵ
	static String engName = "";//Java����ʦ��������������������Ϊ��
	static int engSex = -1;	//Java����ʦ�Ա�1�����У�2����Ů�����������Ա�ֻ������1��2
	static int engEdu = -1;	//Java����ʦѧ����1�����ר��2�����ƣ�3����˶ʿ��4����ʿ��5������������������ѧ��ֻ������1��2��3��4��5
	
	static int basSalary = 3000;	//Java����ʦ��н����������н����Ϊ��ֵ
	static double insurance = 3000*0.105; //Java����ʦ��Ӧ�۱�����������������Ϊ��ֵ
	//����ΪJava����ʦ�¹������ϣ��ڼ���Java����ʦ��нʱ����
	static int comResult = 100;//Java����ʦ������ɷ�������СֵΪ0�����ֵΪ150��
	static double workDay = 100;//Java����ʦ��ʵ�������������������ֵ��ΧΪ1~31
	static double engSalary = 0.0;//Java����ʦ����
	
	static int userSel;
	static boolean status = false;//��ʾJava����ʦ�����Ƿ��������
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		while(true){
			
			userSel = showMenu();
			switch(userSel){
				case 0:
					System.out.println("�������!");
					break;
				case 1:
					System.out.println("����������Java����ʦ����");
					inputEngInf();
					break;
				case 2:
					System.out.println("��ɾ��Java����ʦ����...");
					deleteEngInf();
					break;
				case 3:
					System.out.println("����ѯJava����ʦ������...");
					searchEngInf();
					break;
				case 4:
					System.out.println("���޸�Java����ʦ������...");
					break;
				case 5:
					calEngSalary();
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
					break;
				default:
					System.out.println("�����������!");
					break;
			}
			if(userSel==0){
				break;
			}
		}
	}
	//��ʾ���˵�
	public static int showMenu(){
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
		System.out.print("����������ѡ��");
		userSel = input.nextInt();
		return userSel;
	}
	//����Java����ʦ����
	public static void inputEngInf(){
		if(status==true){
			System.out.println("Java����ʦ������������ϣ����Խ���4�����޸�!");
		}else{
			while(!status){
				System.out.print("������Java����ʦ�ı�ţ�");
				engNo = input.nextInt();
				if(engNo<0){
					status = false;
					System.out.println("Java����ʦ��Ų���Ϊ��ֵ!");
					continue;
				}else{
					status = true;
				}
				
				System.out.print("������Java����ʦ��������");
				engName = input.next();
				if(engName.length()==0){
					status = false;
					System.out.println("Java����ʦ���ֲ���Ϊ��!");
					continue;
				}else{
					status = true;
				}
				
				System.out.print("������Java����ʦ���Ա𣺣�1�����У�2����Ů��");
				engSex = input.nextInt();
				if(engSex!=1&&engSex!=2){
					status = false;
					System.out.println("�Ա�ֻ������1��2!");
					continue;
				}else{
					status = true;
				}
				
				System.out.print("������Java����ʦ��ѧ������1�����ר��2�����ƣ�3����˶ʿ��4����ʿ��5����������");
				engEdu = input.nextInt();
				if(engEdu!=1&&engEdu!=2&&engEdu!=3&&engEdu!=4&&engEdu!=5){
					status = false;
					System.out.println("ѧ��ֻ������1��2��3��4��5");
					continue;
				}else{
					status = true;
				}
				
				System.out.print("������Java����ʦ��н��");
				basSalary = input.nextInt();
				if(basSalary<=0){
					status = false;
					System.out.println("Java����ʦ�ĵ�н����Ϊ��ֵ!");
					continue;
				}else{
					status = true;
				}
				
				System.out.print("������Java����ʦ��Ӧ�۱��ս�");
				insurance = input.nextDouble();
				if(insurance<=0){
					status = false;
					System.out.println("Java����ʦ����Ӧ�۱��ս���Ϊ��ֵ");
					continue;
				}else{
					status = true;
				}
			}
		}
	}
	//ɾ��ָ��Java����ʦ����
	public static void deleteEngInf(){
		
	}
	//��ѯJava����ʦ����
	public static void searchEngInf(){
		
	}
	//�޸�Java����ʦ����
	public static void modifyEngInf(){
		
	}
	//����Java����ʦ����
	public static void calEngSalary(){
		if(status=false){
			System.out.println("������Java����ʦ����δ�������ɾ�������ܼ���!");
		}else{
			while(true){
				System.out.print("������Java����ʦ������ɷ�������СֵΪ0�����ֵΪ150��");
				comResult = input.nextInt();
				if(comResult<0||comResult>150){
					System.out.println("�����������������!");
					continue;
				}else{
					break;
				}
			}
			while(true){
				System.out.print("������Java����ʦ�¹��������������СֵΪ0�����ֵΪ31����");
				workDay = input.nextInt();
				if(workDay<0||workDay>31){
					System.out.println("�����������������!");
					continue;
				}else{
					break;
				}
			}
			engSalary = calEngSalaryValue(basSalary,comResult,workDay,insurance);
			System.out.println("Java����ʦ"+engName+"��нΪ��"+engSalary);
		}
	}
	
	public static double calEngSalaryValue(int basSalary,int comResult,double workDay,double insurance){
		return basSalary+basSalary*0.25*comResult/100+15*workDay-insurance;
	}

	
	// public static void subFun5(){
		// double engSalary = 0.0;//Java����ʦ��н
		// int basSalary = 10000;//�µ�н
		// int comResult = 100;
		// double workDay = 22;
		// double insurance = basSalary*0.105;
		
		// Scanner input = new Scanner(System.in);
		// System.out.print("������Java����ʦ��н��");
		// basSalary = input.nextInt();
		// System.out.print("������Java����ʦ�¹�����ɷ�������СֵΪ0�����ֵΪ150����");
		// comResult = input.nextInt();
		// System.out.print("������Java����ʦʵ�ʹ���������");
		// workDay = input.nextDouble();0
		// System.out.print("������Java����ʦ��Ӧ�۱�������");
		// insurance = input.nextDouble();
		
		// engSalary = basSalary + basSalary*0.25*comResult/100 + 15*workDay + insurance;
		// System.out.println("java����ʦ��нΪ��"+engSalary);
	// }
}