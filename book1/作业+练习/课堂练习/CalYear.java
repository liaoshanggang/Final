/* ������ʵ��˼·��
1����ʼʱ�䣺1900-1-1		����һ
2������ʱ�䣺2016-11-27		������
3����ʼʱ�� -->  ����ʱ��  ��������

	3-1:������֮������
	3-2:������֮������
	3-3:����������֮������
		
	ʵ�ʵ��������
		3-3-1:1900-1-1��2016-1-1
		3-3-2:2016-1-1��2016-11-1
		2016-11-1��2016-1-27
�������⣺
	1�����ʵ��ǰ��Ŀո�
	2�����ʵ�ֻ��� */
import java.util.Scanner;
class CalYear{
	public static void main(String[] args){
		while(true){
			Scanner input = new Scanner(System.in);
			System.out.print("�������꣺");
			int year = input.nextInt();
			System.out.print("�������£�");
			int month = input.nextInt();
			System.out.print("�������죺");
			int day = input.nextInt();
			
			//�ж���������Ƿ�Ϊ����
			boolean leapFlag = false; 
			if(year%4==0&&year%100!=0||year%400==0){
				leapFlag = true;
			}else{
				leapFlag = false;
			}
			
			//����1900-1-1��year-1-1֮�������
			int day1 = 0;
			for(int i=1900;i<year;i++){
				if(i%4==0&&i%100!=0||i%400==0){
					day1 = day1 + 366;
				}else{
					day1 = day1 + 365;
				}
			}
			// System.out.println("����1900-1-1��"+year+"-1-1֮�������:"+day1);
			
			//����year-1-1��year-day-1֮�������
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
			// System.out.println("����"+year+"-1-1��"+year+"-"+day+"-1֮���������"+day2);
			// int day3 = day;
			// int sumDay = day1 + day2 + day;
			// System.out.println("����1900-1-1��"+year+"-"+day+"-1֮���������"+sumDay);
			System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
			
			//ʵ������ǰ�Ŀո񣬹��ɣ����ٿո��Ӧ�����µ�һ�����������
			int datefirst = day1 + day2 +1;  
			int weekday = datefirst%7;//�������ж�Ӧ�����������
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
			
			//�������
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