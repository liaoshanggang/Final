import java.util.Scanner;
/*1、循环输出1到100之间的所有偶数*/
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
/* 2、循环输出100到200之间所有能被2和3整除的数 */
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
/* 3、计算1+3+5+7.......+99的和 */
class TestWhile3{
	public static void main(String[] args){
		int sum = 0;
		int i = 1;
		while(i<100){
			sum = sum + i;
			i+=2;
		}
		System.out.println("1+3+5+7.......+99的和为："+sum);
	}
}

/* 4、循环输出200到1000之间，只要能被5整除，或则能被8整除的数 */
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

/* 5、循环输入10个整数，统计这10个整数中有多少个偶数 */
//import java.util.Scanner;
class TestWhile5{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = 0;
		int i = 1;
		int j = 0;//计数
		while(i<=10){
			System.out.print("请输入第"+i+"个整数：");
			num = in.nextInt();
			if(num%2==0){
				j++;
			}
			i++;
		}
		System.out.print("循环输入10个整数，这10个整数中有"+j+"个偶数");
	}
}
/* 6、计算2+4+6+……+100的结果 */
class TestWhile6{
	public static void main(String[] args){
		int sum = 0;
		int i = 0;
		while(i<=100){
			sum = sum + i;
			i+=2;
		}
		System.out.println("2+4+6+……+100的结果"+sum);
	}
}


/* 7、一球从100米高度自由落下，每次落地后反跳回原高度的一半；
再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？(用程序实现)  */
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
		System.out.println("第"+i+"次落地时经过"+sum+"米");
		System.out.println("第"+i+"次落地后反弹"+hight+"米");
	}
}
/* 8、计算2000年的1月1到2008年的1月1日之间相隔有多少天。
（提示：平年有365天，润年有366天，循环从2000年到2008年结束） */
class TestWhile8{
	public static void main(String[] args){
		int leapYear = 0;//计润年数
		int year = 0;//平年数
		int i = 2000;
		while(i<2008){
			if(i%4==0&&i%100!=0||i%400==0){
				leapYear++;
			}
			year++;
			i++;
		}
		int sumLy = leapYear*366;//闰年天数和
		int sumy = (year-leapYear)*365;//平年天数和
		int sum = sumLy + sumy;//平年和润年天数总和
		System.out.println("2000年的1月1到2008年的1月1日之间相隔有"+sum+"天");
	}
}
/* 9、计算2008年的1月1日，到2008年的9月1日相隔有多少天。
（提示：如果是润年的2月就有29天，平年的2月有28天。
1、3、5、7、8、10、12月都有31天，4、6、9、11月都有30天）
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
		System.out.println("2008年的1月1日，到2008年的9月1日相隔有"+sum+"天。");
	}
}
/* 10、计算2000年的1月1日到2008年的9月1日相隔多少天。 */
class TestWhile10{
	public static void main(String[] args){
		int leapYear = 0;//计润年数
		int year = 0;//平年数
		int i = 2000;
		
		//2000年的1月1到2008年的1月1日的天数
		while(i<2008){
			if(year%4==0&&year%100!=0||year%400==0){
				leapYear++;
			}
			year++;
			i++;
		}
		int sum1 = leapYear*366 + (year-leapYear)*365;//平年和润年总和
		System.out.println("2000年的1月1到2008年的1月1日之间相隔有"+sum1+"天");
		
		//2008年的1月1日，到2008年的9月1日的天数
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
		System.out.println("2008年的1月1日，到2008年的9月1日相隔有"+sum2+"天。");
		
		int sum = sum1 + sum2;
		System.out.println("2000年的1月1日到2008年的9月1日相隔"+sum+"天。");
		
	}
}

/* 11、循环输入字符串，将这些输入的字符串都连接起来，
至到输入的字符串为“Esc”就结束循环，最后显示这个连接起来的字符串。
比如：输入abc      输入def        输入Esc
      就输出abcdef */
//import java.util.Scanner;
class TestWhile11{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String st = "";
		String stconta = "";
		while(true){
			System.out.print("请输入字符串：（输入Esc结束）");
			st = in.next();
			if(st.equals("Esc")){
				break;
			}
			stconta = stconta + st;
		}
		System.out.println(stconta);
	}
}
/* 12、山上有一口缸可以装50升水,现在有15升水.老和尚叫小和尚下山挑水,每次可以挑5升.
问:小和尚要挑几次水才可以把水港挑满? (使用while)*/
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
		System.out.println("小和尚要挑"+i+"次水才可以把水港挑满");
	}
}
/* 14、请输入今天的日期（月/日<用两位数表示：）： 05/29
请输入会员号： 1234 
请输入客户生日：08/09 
然后判断是否今天生日
是否继续（y/n):y  */
//import java.util.Scanner;
class TestWhile14{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String date ="";
		int num = 0;
		String birDate = "";
		String a = "";
		while(true){
			System.out.print("请输入今天的日期（形式月/日<用两位数表示）：");
			date = input.next();
			System.out.print("请输入会员号：");
			num = input.nextInt();
			System.out.print("请输入客户生日：");
			birDate = input.next();
			if(date.equals(birDate)){
				System.out.println("今天是会员号："+num+"客户的生日");
			}else{
				System.out.println("今天不是会员号："+num+"客户的生日");
			}
			System.out.print("是否继续（y/n):");
			a = input.next();
			if(a.equals("n")){
				break;
			}
		}
	}
}
/*
15、循环输出以下结果：(do-while)
	2*5=10
	4*10=40
	6*15=90
	……
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
