import java.util.Scanner;
/*1��ѭ�����1��100֮�������ż��*/
class TestWhile1{
	public static void main(String[] args){
		int i = 1;
		while(i<=100){
			if(i%2==0){
				System.out.print(i+"\t");
			}
			if(i%10==0){ 
				System.out.println();
			}
			i++;
		}
	}
}
/* 2��ѭ�����100��200֮�������ܱ�2��3�������� */
class TestWhile2{
	public static void main(String[] args){
		int num = 100;
		while(num<=200){
			if(num%2==0&&num%3==0){
				System.out.print(num+"\t");
			}
			num++;
		}
	}
}
/* 3������1+3+5+7.......+99�ĺ� */
class TestWhile3{
	public static void main(String[] args){
		int sum = 0;
		int i = 1;
		while(i<100){
			sum = sum + i;
			i+=2;
		}
		System.out.println("1+3+5+7.......+99�ĺ�Ϊ��"+sum);
	}
}

/* 4��ѭ�����200��1000֮�䣬ֻҪ�ܱ�5�����������ܱ�8�������� */
class TestWhile4{
	public static void main(String[] args){
		int i = 200;
		while(i<=1000){
			if(i%5==0||i%8==0){
				System.out.print(i+"\t");
			}
			i++;
		}
	}
}

/* 5��ѭ������10��������ͳ����10���������ж��ٸ�ż�� */
//import java.util.Scanner;
class TestWhile5{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = 0;
		int i = 1;
		int j = 0;//����
		while(i<=10){
			System.out.print("�������"+i+"��������");
			num = in.nextInt();
			if(num%2==0){
				j++;
			}
			i++;
		}
		System.out.print("ѭ������10����������10����������"+j+"��ż��");
	}
}
/* 6������2+4+6+����+100�Ľ�� */
class TestWhile6{
	public static void main(String[] args){
		int sum = 0;
		int i = 0;
		while(i<=100){
			sum = sum + i;
			i+=2;
		}
		System.out.println("2+4+6+����+100�Ľ��"+sum);
	}
}


/* 7��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
�����£������ڵ�10�����ʱ�������������ף���10�η�����ߣ�(�ó���ʵ��)  */
class TestWhile7{
	public static void main(String[] args){
		double hight = 100;
		double sum = hight;
		int i = 0;
		while(i<10){
			if(i>=1){
				sum = sum + hight*2;
			}
			hight = hight/2;
			i++;
		}
		System.out.println("��"+i+"�����ʱ����"+sum+"��");
		System.out.println("��"+i+"����غ󷴵�"+hight+"��");
	}
}
/* 8������2000���1��1��2008���1��1��֮������ж����졣
����ʾ��ƽ����365�죬������366�죬ѭ����2000�굽2008������� */
class TestWhile8{
	public static void main(String[] args){
		int leapYear = 0;//��������
		int year = 0;//ƽ����
		int i = 2000;
		while(i<2008){
			if(i%4==0&&i%100!=0||i%400==0){
				leapYear++;
			}
			year++;
			i++;
		}
		int sumLy = leapYear*366;//����������
		int sumy = (year-leapYear)*365;//ƽ��������
		int sum = sumLy + sumy;//ƽ������������ܺ�
		System.out.println("2000���1��1��2008���1��1��֮�������"+sum+"��");
	}
}
/* 9������2008���1��1�գ���2008���9��1������ж����졣
����ʾ������������2�¾���29�죬ƽ���2����28�졣
1��3��5��7��8��10��12�¶���31�죬4��6��9��11�¶���30�죩
 */
class TestWhile9{
	public static void main(String[] args){
		int i = 1;
		int year = 2008;
		int sum = 0;
		while(i<9){
			if(i==4||i==6||i==9||i==11){
				sum = sum + 30;
			}else if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					sum = sum + 29;
				}else{
					sum = sum + 28;
				}
			}else{
				sum = sum + 31;
			}
			i++;
		}
		System.out.println("2008���1��1�գ���2008���9��1�������"+sum+"�졣");
	}
}
/* 10������2000���1��1�յ�2008���9��1����������졣 */
class TestWhile10{
	public static void main(String[] args){
		int leapYear = 0;//��������
		int year = 0;//ƽ����
		int i = 2000;
		
		//2000���1��1��2008���1��1�յ�����
		while(i<2008){
			if(year%4==0&&year%100!=0||year%400==0){
				leapYear++;
			}
			year++;
			i++;
		}
		int sum1 = leapYear*366 + (year-leapYear)*365;//ƽ��������ܺ�
		System.out.println("2000���1��1��2008���1��1��֮�������"+sum1+"��");
		
		//2008���1��1�գ���2008���9��1�յ�����
		int j = 1;
		int year1 = 2008;
		int sum2 = 0;
		while(j<9){
			if(j==4||j==6||j==9||j==11){
				sum2 = sum2 + 30;
			}else if(j==2){
				if(year%4==0&&year%100!=0||year%400==0){
					sum2 = sum2 + 29;
				}else{
					sum2 = sum2 + 28;
				}
			}else{
				sum2 = sum2 + 31;
			}
			j++;
		}
		System.out.println("2008���1��1�գ���2008���9��1�������"+sum2+"�졣");
		
		int sum = sum1 + sum2;
		System.out.println("2000���1��1�յ�2008���9��1�����"+sum+"�졣");
		
	}
}

/* 11��ѭ�������ַ���������Щ������ַ���������������
����������ַ���Ϊ��Esc���ͽ���ѭ���������ʾ��������������ַ�����
���磺����abc      ����def        ����Esc
      �����abcdef */
//import java.util.Scanner;
class TestWhile11{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String st = "";
		String stconta = "";
		while(true){
			System.out.print("�������ַ�����������Esc������");
			st = in.next();
			if(st.equals("Esc")){
				break;
			}
			stconta = stconta + st;
		}
		System.out.println(stconta);
	}
}
/* 12��ɽ����һ�ڸ׿���װ50��ˮ,������15��ˮ.�Ϻ��н�С������ɽ��ˮ,ÿ�ο�����5��.
��:С����Ҫ������ˮ�ſ��԰�ˮ������? (ʹ��while)*/
class TestWhile12{
	public static void main(String[] args){
		
		int sum = 15;
		int i = 0;
		while(true){
			sum = sum + 5;
			i++;
			if(sum==50){
				break;
			}
		}
		System.out.println("С����Ҫ��"+i+"��ˮ�ſ��԰�ˮ������");
	}
}
/* 14���������������ڣ���/��<����λ����ʾ������ 05/29
�������Ա�ţ� 1234 
������ͻ����գ�08/09 
Ȼ���ж��Ƿ��������
�Ƿ������y/n):y  */
//import java.util.Scanner;
class TestWhile14{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String date ="";
		int num = 0;
		String birDate = "";
		String a = "";
		while(true){
			System.out.print("�������������ڣ���ʽ��/��<����λ����ʾ����");
			date = input.next();
			System.out.print("�������Ա�ţ�");
			num = input.nextInt();
			System.out.print("������ͻ����գ�");
			birDate = input.next();
			if(date.equals(birDate)){
				System.out.println("�����ǻ�Ա�ţ�"+num+"�ͻ�������");
			}else{
				System.out.println("���첻�ǻ�Ա�ţ�"+num+"�ͻ�������");
			}
			System.out.print("�Ƿ������y/n):");
			a = input.next();
			if(a.equals("n")){
				break;
			}
		}
	}
}
/*
15��ѭ��������½����(do-while)
	2*5=10
	4*10=40
	6*15=90
	����
	?*100=?
   */
   
class TestWhile15{
	public static void main(String[] args){
		int i = 2;
		int j = 5;
		do{
			System.out.println(i+"*"+j+"="+i*j);
			i += 2;
			j += 5;
		}while(j<=100);
	}
}
