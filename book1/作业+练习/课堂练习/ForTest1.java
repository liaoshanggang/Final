/* 8������2000���1��1��2008���1��1��֮������ж����졣����ʾ��ƽ����365�죬������366�죬ѭ����2000�굽2008������� */
class ForTest1{
	public static void main(String[] args){
		// int leapYear = 0;//��������
		// int year = 0;//ƽ������
		// int sumLy = 0;//����������
		// int sumy = 0;//ƽ��������
		
		// for(int i = 2000;i<2008;i++){
			// if(i%4==0&&i%100!=0||i%400==0){
				// leapYear++;
			// }
			// year++;
		// }
		// sumLy = leapYear*366;
		// sumy = (year-leapYear)*365;
		// int sum = sumLy + sumy;//�ܺ�
		// System.out.println("2000���1��1��2008���1��1��֮�������"+sum+"��");
		int sum = 0;
		for(int year=2000;year<2008;year++){
			if((year%4==0&&year%100!=0)||year%400==0){
				sum = sum + 366;
			}else{
				sum = sum + 365;
			}
		}
		System.out.println("2000���1��1��2008���1��1��֮�������"+sum+"��");
	}
}
/* 9������2008���1��1�գ���2008���9��1������ж����졣
����ʾ������������2�¾���29�죬ƽ���2����28�졣1��3��5��7��8��10��12�¶���31�죬4��6��9��11�¶���30�죩
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
			//��if
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
			//��switch
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
		System.out.println("2000���1��1��2008���1��1��֮�������"+sum+"��");
		
		
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
		// System.out.println("2008���1��1�գ���2008���9��1�������"+sum+"�졣");
	}
}
/* 10������2000���1��1�յ�2008���9��1����������졣 */
class TestWhile10{
	public static void main(String[] args){
		int leapYear = 0;//��������
		int year = 0;//ƽ����
		int i = 2000;
		while(i<2008){
			if(year%4==0&&year%100!=0||year%400==0){
				leapYear++;
			}
			year++;
			i++;
		}
		int sum1 = leapYear*366 + (year-leapYear)*365;//ƽ��������ܺ�
		System.out.println("2000���1��1��2008���1��1��֮�������"+sum1+"��");
		
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
		System.out.println("2008���1��1�գ���2008���9��1�������"+sum2+"�졣");
		
		int sum = sum1 + sum2;
		System.out.println("2000���1��1�յ�2008���9��1�����"+sum+"�졣");
		
	}
}