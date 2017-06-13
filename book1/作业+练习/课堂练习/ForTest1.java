/* 8、计算2000年的1月1到2008年的1月1日之间相隔有多少天。（提示：平年有365天，润年有366天，循环从2000年到2008年结束） */
class ForTest1{
	public static void main(String[] args){
		// int leapYear = 0;//闰年年数
		// int year = 0;//平年年数
		// int sumLy = 0;//闰年天数和
		// int sumy = 0;//平年天数和
		
		// for(int i = 2000;i<2008;i++){
			// if(i%4==0&&i%100!=0||i%400==0){
				// leapYear++;
			// }
			// year++;
		// }
		// sumLy = leapYear*366;
		// sumy = (year-leapYear)*365;
		// int sum = sumLy + sumy;//总和
		// System.out.println("2000年的1月1到2008年的1月1日之间相隔有"+sum+"天");
		int sum = 0;
		for(int year=2000;year<2008;year++){
			if((year%4==0&&year%100!=0)||year%400==0){
				sum = sum + 366;
			}else{
				sum = sum + 365;
			}
		}
		System.out.println("2000年的1月1到2008年的1月1日之间相隔有"+sum+"天");
	}
}
/* 9、计算2008年的1月1日，到2008年的9月1日相隔有多少天。
（提示：如果是润年的2月就有29天，平年的2月有28天。1、3、5、7、8、10、12月都有31天，4、6、9、11月都有30天）
 */
class ForTest2{
	public static void main(String[] args){
		
		int year = 2008;
		int sum = 0;
		boolean flag = false;
		// if((year%4==0&&year%100!=0)||(year%400==0)){
			// flag = true;
		// }else{
			// flag = false;
		// }
		for(int i = 1;i<9;i++){
			//用if
			if(i==4||i==6||i==9||i==11){
				sum = sum + 30;
			}else if(i==2){
				if((year%4==0&&year%100!=0)||(year%400==0)){
					sum = sum +29;
				}else{
					sum = sum +28;
				}
			}else{
				sum = sum + 31;
			}
			//用switch
			// switch(i){
				// case 4:
				// case 6:
				// case 9:
				// case 11:
					// sum = sum + 30;
					// break;
				// case 2:
					// if((year%4==0&&year%100!=0)||(year%400==0)){
						// sum = sum +29;
					// }else{
						// sum = sum +28;
					// }
					// break;
				// default:
					// sum = sum + 31;
					// break;
			// }
			
		}
		System.out.println("2000年的1月1到2008年的1月1日之间相隔有"+sum+"天");
		
		
		// int i = 1;
		// int year = 2008;
		// int sum = 0;
		// while(i<9){
			// if(i==4&&i==6&&i==9&&i==11){
				// sum = sum + 30;
			// }else if(i==2){
				// if(year%4==0&&year%100!=0||year%400==0){
					// sum = sum + 29;
				// }else{
					// sum = sum + 28;
				// }
			// }else{
				// sum = sum + 31;
			// }
			// i++;
		// }
		// System.out.println("2008年的1月1日，到2008年的9月1日相隔有"+sum+"天。");
	}
}
/* 10、计算2000年的1月1日到2008年的9月1日相隔多少天。 */
class TestWhile10{
	public static void main(String[] args){
		int leapYear = 0;//计润年数
		int year = 0;//平年数
		int i = 2000;
		while(i<2008){
			if(year%4==0&&year%100!=0||year%400==0){
				leapYear++;
			}
			year++;
			i++;
		}
		int sum1 = leapYear*366 + (year-leapYear)*365;//平年和润年总和
		System.out.println("2000年的1月1到2008年的1月1日之间相隔有"+sum1+"天");
		
		int j = 1;
		int year1 = 2008;
		int sum2 = 0;
		while(j<9){
			if(j==4&&j==6&&j==9&&j==11){
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