/*   
��Ŀ���ӿ���̨�����û��������룬����û�����������ȷ����ʾ��¼�ɹ���
������ʾ�û������󣬻���������������µ�¼��
*/ 
import java.util.Scanner;
class Test2_4{
	public static void main(String[] args){
		String user = "";
		String pwd = "";
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		while(!flag){
			System.out.print("�������û���:");
			user = input.next();
			System.out.print("���������룺");
			pwd = input.next();
			if(user.equals("����")&&pwd.equals("123")){
				System.out.println("��½�ɹ�");
				flag = true;
			}else{
				System.out.println("�û������󣬻���������������µ�¼");
				flag = false;
			}
		}		
	}
}
/*��Ŀ����1+2!+3!+...+20!�ĺ͡�*/
class Test2_3{
	public static void main(String[] args){
		double sum = 0;
		double xiang = 1;
		for(double i=1;i<=20;i++){
			xiang = xiang*i;
			sum = sum + xiang;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}

/*  ��Ŀ����һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡� 
�����������ץס�������ĸ�ı仯���ɡ�
*/
class Test2_2{
	public static void main(String[] args){
		double a = 1;
		double b = 2;
		double c = 0;
		double sum = 0;
		double temp = 0;
		for(int i=1;i<=20;i++){
			c = b/a;
			temp = b;
			b = a+b;
			a = temp;
			sum = sum +c;
		}
		System.out.println("�������У�2/1��3/2��5/3��8/5...ǰ20��֮��:Ϊ��"+sum);
	}
}

/*  ��Ŀ��ʵ��һ������ִ�мӼ��˳��ļ򵥵ļ�������
˼·��������switch ���� if��if-else���ʵ��
 */
class Test2_1{
	public static void main(String[] args){
		double oper1 = 0;
		double oper2 = 0;	
		double result = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("�����������1��");
		oper1 = input.nextDouble();
		System.out.print("�����������2��");
		oper2 = input.nextDouble();
		System.out.print("������Ҫ������������");
		char ch = input.next().charAt(0);
		switch(ch){
		case '+':
			result = oper1 + oper2;
			break;
		case '-':
			result = oper1 - oper2;
			break;
		case '*':
			result = oper1 * oper2;
			break;
		case '/':
			result = oper1 / oper2;
			break;
		}
		System.out.println(oper1+" "+ch+" "+oper2+"="+result);
	}
}

class Test2{
	 /* ��Ŀ��
		��ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
		���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���   
		�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��
	*/
	public static void main(String[] args){
		int geWei = 0;
		int shiWei = 0;
		int baiWei = 0;

		for(int i=100;i<999;i++){
			geWei = i%10;
			shiWei = i%100/10;
			baiWei = i/100;
			if((geWei*geWei*geWei+shiWei*shiWei*shiWei+baiWei*baiWei*baiWei)==i){
				System.out.print(i+" ");
			}
		}
	}
}
 

 