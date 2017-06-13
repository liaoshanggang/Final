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
class CalYear{
	public static void main(String[] args){
		while(true){
			Scanner input = new Scanner(System.in);
			System.out.print("请输入年：");
			int year = input.nextInt();
			System.out.print("请输入月：");
			int month = input.nextInt();
			System.out.print("请输入天：");
			int day = input.nextInt();
			
			//判断输入的年是否为闰年
			boolean leapFlag = false; 
			if(year%4==0&&year%100!=0||year%400==0){
				leapFlag = true;
			}else{
				leapFlag = false;
			}
			
			//计算1900-1-1到year-1-1之间的天数
			int day1 = 0;
			for(int i=1900;i<year;i++){
				if(i%4==0&&i%100!=0||i%400==0){
					day1 = day1 + 366;
				}else{
					day1 = day1 + 365;
				}
			}
			// System.out.println("计算1900-1-1到"+year+"-1-1之间的天数:"+day1);
			
			//计算year-1-1到year-day-1之间的天数
			int day2 = 0;
			for(int i=1;i<month;i++){
				switch(i){
					case 4:
					case 6:
					case 9:
					case 11:
						day2 = day2 + 30;
						break;
					case 2:
						if(leapFlag){
							day2 = day2 + 29;
						}else{
							day2 = day2 + 28;
						}
						break;
					default:
						day2 = day2 + 31;
						break;
				}
			}
			// System.out.println("计算"+year+"-1-1到"+year+"-"+day+"-1之间的天数："+day2);
			// int day3 = day;
			// int sumDay = day1 + day2 + day;
			// System.out.println("计算1900-1-1到"+year+"-"+day+"-1之间的天数："+sumDay);
			System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
			
			//实现日历前的空格，规律：多少空格对应于那月第一天的星期数字
			int datefirst = day1 + day2 +1;  
			int weekday = datefirst%7;//求日历中对应天的星期数字
			int j = 0;
			for(int i=1;i<=weekday;i++){
				System.out.print("\t");
				j++;
			}
			int monthDay;
			switch(month){
				case 4:
				case 6:
				case 9:
				case 11:
					monthDay = 30;
					break;
				case 2:
					if(leapFlag){
						monthDay = 29;
					}else{
						monthDay = 28;
					}
					break;
				default:
					monthDay = 31;
					break;
			}
			
			//输出日期
			for(int i=1;i<=monthDay;i++){
				System.out.print(i+"\t");
				if((i+j)%7==0){
					System.out.println();
				}
			}
			System.out.println();
		}
		
	}
}