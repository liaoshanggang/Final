import java.util.Scanner;
public class Year{
	/*
	万年历
	*/
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = input.nextInt();//2016
		System.out.print("请输入月份：");
		int month = input.nextInt();//11
		
		//1、输入的年份是(润年和平年)
		boolean flag = false;
		if((year%4==0&&year%100!=0)||(year%400==0)){
			//润年
			flag = true;
		}else{
			//平年
			flag = false;
		}
		//定义一个变量，用来存储相隔的天数
		int day = 0;
		
		//2、从1900年开始到输入的年份（2016）相差的天数
		for(int i=1900;i<year;i++){//1900、1901、1902..2015
			//判断当前年份是平年还是润年
			if((i%4==0&&i%100!=0)||(i%400==0)){
				//润年(366)
				day =day + 366;
			}else{
				//平年(365)
				day =day + 365;
			}
		}
		//System.out.println("1900到2015年底相隔的天数:"+day);
		
		//3、从当前年的1月1号开始到输入月份-1，相隔的天数
		for(int i=1;i<month;i++){//1-10
			switch(i){
				case 4:
				case 6:
				case 9:
				case 11:
					//小月的情况
					day += 30;
					break;
				case 2:
					//判断年份是平年还是润年
					if(flag == true){
						day +=29;
					}else{
						day +=28;
					}
					break;
				default:
					//大月的情况
					day +=31;
					break;
			}
		}
		
		//System.out.println("190011开始到前一个月月底相差的天数"+day);
		//42368
		//4、得到当前月的第一天的相差天数
		day = day +1;//11.1   (42369)
		
		//5、算出2016.11.1这天是星期二   (1900.1.1 星期一)
		int weekDay = day % 7;
		System.out.println("weekDay:"+weekDay);
		
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		
		//6、1号前面的空格是跟1号对应的星期数有关
		//1号是星期几，则就空几个格
		//通过循环来操作它的空格数
		for(int i=0;i<weekDay;i++){
			System.out.print("\t");
		}
		
		
		//问题：每月的天数固定了，如何让它动态根据具体月份改变
		//实现:根据输入的年份及月份来确定天数
		//判断年份是平年还是润年
		
		//重新定义变量，用来保存当前输入月份对应的天数
		int monthDay = 0;
		switch(month){
				case 4:
				case 6:
				case 9:
				case 11:
					//小月的情况
					monthDay = 30;
					break;
				case 2:
					//判断年份是平年还是润年
					if(flag == true){
						monthDay = 29;
					}else{
						monthDay = 28;
					}
					break;
				default:
					//大月的情况
					monthDay = 31;
					break;
			}
		
	
		
		
		//7、打印日期数(实现换行)
		for(int i=1;i<=monthDay;i++){
			//判断
			if(day%7==6){
				System.out.print(i+"\n");
			}else{
				System.out.print(i+"\t");
			}
			day++;
		}
		
	}
}