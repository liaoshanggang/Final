import java.util.Scanner;
public class Year{
	/*
	������
	*/
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year = input.nextInt();//2016
		System.out.print("�������·ݣ�");
		int month = input.nextInt();//11
		
		//1������������(�����ƽ��)
		boolean flag = false;
		if((year%4==0&&year%100!=0)||(year%400==0)){
			//����
			flag = true;
		}else{
			//ƽ��
			flag = false;
		}
		//����һ�������������洢���������
		int day = 0;
		
		//2����1900�꿪ʼ���������ݣ�2016����������
		for(int i=1900;i<year;i++){//1900��1901��1902..2015
			//�жϵ�ǰ�����ƽ�껹������
			if((i%4==0&&i%100!=0)||(i%400==0)){
				//����(366)
				day =day + 366;
			}else{
				//ƽ��(365)
				day =day + 365;
			}
		}
		//System.out.println("1900��2015������������:"+day);
		
		//3���ӵ�ǰ���1��1�ſ�ʼ�������·�-1�����������
		for(int i=1;i<month;i++){//1-10
			switch(i){
				case 4:
				case 6:
				case 9:
				case 11:
					//С�µ����
					day += 30;
					break;
				case 2:
					//�ж������ƽ�껹������
					if(flag == true){
						day +=29;
					}else{
						day +=28;
					}
					break;
				default:
					//���µ����
					day +=31;
					break;
			}
		}
		
		//System.out.println("190011��ʼ��ǰһ�����µ���������"+day);
		//42368
		//4���õ���ǰ�µĵ�һ����������
		day = day +1;//11.1   (42369)
		
		//5�����2016.11.1���������ڶ�   (1900.1.1 ����һ)
		int weekDay = day % 7;
		System.out.println("weekDay:"+weekDay);
		
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		
		//6��1��ǰ��Ŀո��Ǹ�1�Ŷ�Ӧ���������й�
		//1�������ڼ�����Ϳռ�����
		//ͨ��ѭ�����������Ŀո���
		for(int i=0;i<weekDay;i++){
			System.out.print("\t");
		}
		
		
		//���⣺ÿ�µ������̶��ˣ����������̬���ݾ����·ݸı�
		//ʵ��:�����������ݼ��·���ȷ������
		//�ж������ƽ�껹������
		
		//���¶���������������浱ǰ�����·ݶ�Ӧ������
		int monthDay = 0;
		switch(month){
				case 4:
				case 6:
				case 9:
				case 11:
					//С�µ����
					monthDay = 30;
					break;
				case 2:
					//�ж������ƽ�껹������
					if(flag == true){
						monthDay = 29;
					}else{
						monthDay = 28;
					}
					break;
				default:
					//���µ����
					monthDay = 31;
					break;
			}
		
	
		
		
		//7����ӡ������(ʵ�ֻ���)
		for(int i=1;i<=monthDay;i++){
			//�ж�
			if(day%7==6){
				System.out.print(i+"\n");
			}else{
				System.out.print(i+"\t");
			}
			day++;
		}
		
	}
}