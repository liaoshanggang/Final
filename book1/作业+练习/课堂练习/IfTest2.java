/*��һ���飺
1000
800
�ڶ�Ů�飺
800
500
������1000
����Ů500	
*/
import java.util.Scanner;
class IfTest2{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		char sex;
		int sport;
		System.out.print("����������ձ�(ֻ���л�Ů)");
		sex = in.next().charAt(0);
		System.out.print("��������Ҫ�μӵ���Ŀ��1000 800 500��");
		sport = in.nextInt();
		if(sex == '��'){
			if(sport == 1000){
				System.out.println("1000��");
			}else{
				System.out.println("800��");
			}
		}else if(sex == 'Ů'){
			if(sport == 800){
				System.out.println("800��");
			}else{
				System.out.println("500��");
			}
		}
	}
}