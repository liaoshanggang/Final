import java.util.Scanner;
import java.util.Random;
class TestForFor3{
	/* 
	3������ʯͷ����Ϸ(�˻���ս)
	*/
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		String mine = "";
		String machine = "";
		int i = 0;//��¼������������
		int k = 0;//��¼��ҳ�������
		int j = 1;//��¼������˶��پ�
		for(;;){
			System.out.println("============��"+j+"��===========");
			System.out.print("������������ƣ�(����0������Ϸ)\n�����");
			mine = input.next();
			if(mine.equals("����")){
				k = 1;
			}else if(mine.equals("ʯͷ")){
				k = 2;
			}else if(mine.equals("��")){
				k = 3;
			}else{
				System.out.println("����");
				if(mine.equals("0")){
					System.out.println("��Ϸ����");
					break;
				}
			}
			//���������
			i = random.nextInt(3)+1;
			switch(i){
				case 1:
					machine = "����";
					break;
				case 2:
					machine = "ʯͷ";
					break;
				case 3:
					machine = "��";
					break;
			}
			System.out.println("��������"+machine);
			//�ж�ʤ��
			if(k==i){
				System.out.println("ƽ��");
			}else if((k==1&&i==3)||(k==2&&i==1)|(k==3&&i==2)){
				System.out.println("��Ӯ��");
			}else{
				System.out.println("������");
			}
			j++;
		}
	}
}
class TestForFor1{
	/* 1���������ͼ��
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6
		1 2 3 4 5 6 7
		1 2 3 4 5 6 7 8
		1 2 3 4 5 6 7 8 9 
	*/
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
class TestForFor2{
	/* 	2���������ͼ��
		   *		
		  ***
		 *****
		*******
		 *****
		  ***
		   *

	*/
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4-i;j++){
			System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
			System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3;i>=1;i--){
			for(int j=1;j<=4-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
