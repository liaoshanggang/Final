import java.util.Scanner;
class EngRegister{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String engName,p1,p2;
		boolean resp = false;//��ʶ�Ƿ�ɹ�
		
		do{
			System.out.println("������Java����ʦ�û�����");
			engName = input.next();
			System.out.println("���������룺");
			p1 = input.next();
			System.out.println("���ٴ��������룺");
			p2 = input.next();
			resp = verify(engName,p1,p2);
		}while(!resp);
		
		
	}	
	//ʹ��verify�������û��������������֤�������Ƿ�ɹ�
	public static boolean verify(String name,String pwd1,String pwd2){
		boolean flag = false;
		if(name.length()<6||pwd1.length()<8){
			System.out.println("�û�������С��6�����볤�Ȳ���С��8");
		}else if(!pwd1.equals(pwd2)){
			System.out.println("������������벻��ͬ��");
		}else{
			System.out.println("ע��ɹ������μ��û��������롣");
			flag = true;
		}
		return flag;
	}
}