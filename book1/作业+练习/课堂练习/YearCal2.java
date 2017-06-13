/* 万年历实现思路：
1、开始时间：1900-1-1		星期一
2、结束时间：2016-11-27		星期天
3、开始时间 -->  结束时间  相差的天数

	3-1:年与年之间的相差
	3-2:月与月之间的相差
	3-3:天数与天数之间的相差
		
	实际的相差天数
		3-3-1:1900-1-1到2016-1-1
		3-3-2:2016-1-1到2016-11-1
		2016-11-1到2016-1-27
两个问题：
	1、如何实现前面的空格
	2、如何实现换行 */
import java.util.Scanner;
class YearCal2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		System.out.print("please input \nyear:");
		year = input.nextInt();
		System.out.print("month:");
		month = input.nextInt();
		System.out.print("day:");
		day = input.nextInt();
		
		boolean start = false;
		boolean end = false;
		System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		for(int i=1;i<=day;i++){
			if(i==1){
				start = true;
			}
			if(i==day){
				end = true;
				i = 1;
			}
			System.out.print(i+"\t");
			if(i%7==0){
				System.out.println();
			}	
		}
		
		
		
		
		
		
		
		
		
		/* int sumYear = year - 1900;//年与年之间的相差
		int chaiMonth = month -1;//两年月与月之间的相对差
		int chaiDay = day - 1;//两年天数与天数之间的相对差
		int sumDay;//实际总天数
		System.out.println("1990年与"+year+"年之间的相差:"+sumYear); */

		
		/* //1900-1-1到2016-1-1
		int sumDay1 = 0;
		for(int i=1900;i<year;i++){
			if((i%4==0&&i%100!=0)||(i%400==0)){
				sumDay1 += 366;
			}else{
				sumDay1 += 365;
			}
		}
		System.out.println("1990-1-1到2016-1-1为天数:"+sumDay1);
		//2016-1-1到2016-11-1
		boolean flag;
		if((year%4==0&&year%100!=0)||(year%400==0)){
			flag = true;
		}else{
			flag = false;
		}
		int sumDay2 = 0;
		for(int i=1;i<month;i++){
			switch(i){
				case 4:
				case 6:
				case 9:
				case 11:
					sumDay2 += 30;
					break;
				case 2:
					if(flag){
						sumDay2 += 29;
					}else{
						sumDay2 += 28;
					}
					break;
				default:
					sumDay2 += 31;
					break;	
			}
		}
		System.out.println("2016-1-1到2016-11-1的天数："+sumDay2);
		//1900-1-1到2016-1-27总天数
		sumDay = sumDay1 + sumDay2 + day;	
		System.out.println("1990-1-1到2016-1-27总天数"+sumDay); */
	}
}

/* /* 万年历实现思路：
1、开始时间：1900-1-1		星期一
2、结束时间：2016-11-27		星期天
3、开始时间 -->  结束时间  相差的天数

	3-1:年与年之间的相差
	3-2:月与月之间的相差
	3-3:天数与天数之间的相差
		
	实际的相差天数
		3-3-1:1900-1-1到2016-1-1
		3-3-2:2016-1-1到2016-11-1
		2016-11-1到2016-1-27
两个问题：
	1、如何实现前面的空格
	2、如何实现换行 
import java.util.Scanner;
class YearCal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		System.out.print("please input \nyear:");
		year = input.nextInt();
		System.out.print("month:");
		month = input.nextInt();
		System.out.print("day:");
		day = input.nextInt();
		int sumYear = year - 1900;//年与年之间的相差
		int chaiMonth = month -1;//两年月与月之间的相对差
		int chaiDay = day - 1;//两年天数与天数之间的相对差
		int sumDay;//实际总天数
		System.out.println("1990年与"+year+"年之间的相差:"+sumYear);
		
		//1900-1-1到2016-1-1
		int sumDay1 = 0;
		for(int i=1900;i<year;i++){
			if((i%4==0&&i%100!=0)||(i%400==0)){
				sumDay1 += 366;
			}else{
				sumDay1 += 365;
			}
		}
		System.out.println("1990-1-1到2016-1-1为天数:"+sumDay1);
		//2016-1-1到2016-11-1
		boolean flag;
		if((year%4==0&&year%100!=0)||(year%400==0)){
			flag = true;
		}else{
			flag = false;
		}
		int sumDay2 = 0;
		for(int i=1;i<month;i++){
			switch(i){
				case 4:
				case 6:
				case 9:
				case 11:
					sumDay2 += 30;
					break;
				case 2:
					if(flag){
						sumDay2 += 29;
					}else{
						sumDay2 += 28;
					}
					break;
				default:
					sumDay2 += 31;
					break;	
			}
		}
		System.out.println("2016-1-1到2016-11-1的天数："+sumDay2);
		//1900-1-1到2016-1-27总天数
		sumDay = sumDay1 + sumDay2 + day;	
		System.out.println("1990-1-1到2016-1-27总天数"+sumDay);
		
		boolean flag1 = false;
		// boolean flag2 = false;
		// boolean flag3 = false;
		// boolean flag4 = false;
		// boolean flag5 = false;
		// boolean flag6 = false;
		// boolean flag7 = false;
		// boolean head = true;
		// boolean end = false;
		// int q=0;
		// while(true){
			
			// System.out.print("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
			// for(int i=1;i<sumDay;i++){
				// switch(month){
					// case 4:
					// case 6:
					// case 9:
					// case 11:
						// q++;
						// System.out.print(q);
						// break;
					// case 2:
					// if(flag){
						// q++;
						// System.out.print(q);
					// }else{
						// q++;
						// System.out.print(q);
					// }
					// break;
				// default:
					// q++;
					// System.out.print(q);
					// break;	
				// }
				// switch(q){
					// case 31:
						// q = 1;
						// head = false;
						// break;
					// case 30:
						// q = 1;
						// head = false;
						// break;
					// default:
						// if(flag){
							// q = 1;
							// head = false;
						// }else{
							// q = 1;
							// head = true;
						// }
						// break;
				// }
			// }
		// }
	}
} */