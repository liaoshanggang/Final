// import java.util.Scanner;
// class TestIf1{
	// /*
		// 1������һ��int�͵����ݣ��ж��������
	   // ���ܱ�2����������ܱ�2������
	   // ��ô������������ż������
	   // ����������������������
	// */
	// public static void main(String[] args){
		// Scanner in = new Scanner(System.in);
		// System.out.print("��������һ��int�͵����ݣ�");
		// int intDig = in.nextInt();
		// if(intDig%2==0){
			// System.out.println("�������ż��");
		// }else{
			// System.out.println("�����������");
		// }
	// }
// }
// import java.util.Scanner;
// class TestIf2{
	// /*
		// 2����������double�͵����ݣ�
		// ���뵽a,b,c����������ȥ��
		// ʹ�������ṹ�뽻���߼���
		// �����������е�ֵ��С��������
	// */
	// public static void main(String[] args){
		// Scanner in = new Scanner(System.in);
		// System.out.print("���������һ��double�͵����ݣ�");
		// double var1 = in.nextDouble();
		// System.out.print("���������һ��double�͵����ݣ�");
		// double var2 = in.nextDouble();
		// System.out.print("���������һ��double�͵����ݣ�");
		// double var3 = in.nextDouble();
		// double temp;
		// if(var1<var2){
			// temp = var1;
			// var1 = var2;
			// var2 = temp;				
		// }
		// if(var1<var3){
			// temp = var1;
			// var1 = var3;
			// var3 = temp;
		// }
		// if(var2<var3){
			// temp = var2;
			// var2 = var3;
			// var3 = temp;
		// }
		// System.out.println("���������е�ֵ��С��������:"+var3+" "+var2+" "+var1);
	// }
// }

// import java.util.Scanner;
// class TestIf3{
	// /*
	// 3�����̳�ȥ������Ʒ�����ȹ�����һ̨���ӻ�����������ӻ��ļ۸�Ȼ���ֹ�����һ�����䣬
	// ���������ļ۸����ǰ̨��Ǯ������ܼ۸�С��100Ԫ�Ͳ����ۣ�����ܼ۸���ڵ���100--1000Ԫ�ʹ�9�ۣ�
	// ����ܼ۸���ڵ���1000Ԫ�ʹ�8��,����ܼ۸����5000Ԫ�ʹ�7�ۡ���������Ҫ����Ԫ��(����if)
	// */
	// public static void main(String[] args){
		// Scanner in = new Scanner(System.in);
		// System.out.print("�������㹺���˵ĵ��ӻ��ļ۸�");
		// double tvPrice = in.nextDouble();
		// System.out.print("�������㹺���˵ı���ļ۸�");
		// double frgPrice = in.nextDouble();
		// double sumPrice = tvPrice + frgPrice;
		// if(sumPrice<100){
			// System.out.println("�����Ҫ"+sumPrice+"Ԫ");
		// }else if(sumPrice>=100&&sumPrice<1000){
			// sumPrice = sumPrice*0.9;
			// System.out.println("�����Ҫ"+sumPrice+"Ԫ");
		// }else if(sumPrice>=1000&&sumPrice<5000){
			// sumPrice = sumPrice*0.8;
			// System.out.println("�����Ҫ"+sumPrice+"Ԫ");
		// }else if(sumPrice>=5000){
			// sumPrice = sumPrice*0.7;
			// System.out.println("�����Ҫ"+sumPrice+"Ԫ");
		// }
	// }
// }
// import java.util.Scanner;
// class TestIf4{
	// /*
	// 4������һ�����������꣬�����������ܱ�4���������ܱ�100�����������ܱ�400�������������һ�������꣬
	// ����������һ����ƽ�ꡣ(��ͨif)
	// */
	// public static void main(String[] args){
		// Scanner in = new Scanner(System.in);
		// System.out.print("��������Ҫ�жϵ���ݣ�");
		// int year = in.nextInt();
		// if(year%4==0&&year%100!=0||year%400==0){
			// System.out.println(year+"��������");
		// }else{
			// System.out.println(year+"����ƽ��");
		// }
	// }
// }

import java.util.Scanner;
class TestIf5{
	/*	
	5��ѧУ��֯�ﾶ�˶����ֱ�������800�ף�Ů����800�ף�������1000�ף�Ů����1000��
	����ݼ���������ȷ�������߲μӵ���Ŀ(Ƕ��if).
	*/
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		String name;
		char sex;
		int sport;
		System.out.print("����������������");
		name = in.next();
		System.out.print("����������ձ�(ֻ���л�Ů)");
		sex = in.next().charAt(0);
		System.out.print("��������Ҫ�μӵ���Ŀ��1000 800��");
		sport = in.nextInt();
		if(sex == '��'){
			if(sport == 1000){
				System.out.println("��Ҫ�μӵ���ĿΪ������1000��");
			}else{
				System.out.println("��Ҫ�μӵ���ĿΪ������800��");
			}
		}else if(sex == 'Ů'){
			if(sport == 1000){
				System.out.println("��Ҫ�μӵ���ĿΪŮ����1000��");
			}else{
				System.out.println("��Ҫ�μӵ���ĿΪŮ����800��");
			}
		}
	}
}