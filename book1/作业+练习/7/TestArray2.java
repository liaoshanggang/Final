/* 4��һ��������Ϸ��ѡ������ */
import java.util.Scanner;
class TestArray2_4{
	public static void main(String[] args){
		int[][] map = new int[6][6];
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				map[i][j] = 0;
			}
		}
		//��ǰ��������
		int x = 1;
		int y = 1;
		//�����û�����
		char oper = 'o';
		int k = 1;//��¼����,ֻ����ͼ���ƶ���Ч
		Scanner input = new Scanner(System.in);
		while(oper!='q'){
			//�������߽��볬���Ļ�����ԭ״
			if((x==-1)||(y==-1)||(x==(map.length))||(y==(map.length))){
				switch(oper){
					case 'w'://����
						x = x+1;
					break;
					case 's'://����
						x = x-1;
					break;
					case 'a':
						y = y+1;
					break;
					case 'd':
						y = y-1;
					break;
				}
				k = k-1;
				continue;
			}
			map[x][y] = 1;//��1��ʾ��ǰλ�ã�
			System.out.println("��"+k+"��");
			map(map);//��ʾÿ��һ���Ļ���
			System.out.println("���������Ĳ�����wΪ���ƣ�sΪ���ƣ�dΪ���ƣ�aΪ���ƣ�q������Ϸ����");
			oper = input.next().charAt(0);
			//�ƶ��������
			switch(oper){
					case 'w'://����
						map[x][y] = 0;//���߹��ĵ�Ϊ0
						x = x-1;
					break;
					case 's'://����
						map[x][y] = 0;
						x = x+1;
					break;
					case 'a':
						map[x][y] = 0;
						y = y-1;
					break;
					case 'd':
						map[x][y] = 0;
						y = y+1;
					break;
				}
			k++;
		}
	}
	//��ʼ��ͼ��ÿ��һ������º���Ҫ�õĵ�ͼ
	public static void map(int[][] map){
		System.out.println("==========================================");
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("==========================================");
	}
}

/* 3���������
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
. . . . . .
. . . . . . . */
// import java.util.Scanner;
class TestArray2_3{
	public static void main(String[] args){
		int arr[][] = new int[10][10];
		for(int i=0;i<arr.length;i++){
			arr[i][0] = 1;
			arr[i][i] = 1;
			if(i>=2){
				for(int j=1;j<arr[i].length-1;j++){
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
			
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
/*2������һ����ά���飬int[3][4]��Ҫ����ѭ������12�����������뵽������
��Ȼ��ʹ��Ƕ��ѭ���ҵ���������е����ֵ��*/
//import java.util.Scanner;
class TestArray2_2{
	public static void main(String[] args){
		int[][] arr = new int[3][4];
		Scanner input = new Scanner(System.in);
		int k=1;//��¼�����˶��ٸ���
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print("�������"+k+"��������");
				arr[i][j] = input.nextInt(); 
				k++;
			}
		}
		int max = arr[0][0];
		int temp = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]>max){
					temp = arr[i][j];
					arr[i][j] = max;
					max = temp;
				} 
			}
		}
		System.out.println("��������е����ֵΪ��"+max);
	}
}
//import java.util.Scanner;
class TestArray2_1{
	/* 1������һ����ά���飬������¼3��ѧ����java,c#,sql���Ź��εĳɼ���
	��ά�����һ�м�¼һ���˵ĳɼ���Ҫ��ѭ�����룬��������ʽ���£�
				java	c#	sql
	��1��ѧ��	89		79	98
	��2��ѧ��	99		80	100
	��3��ѧ��	79		99	87 */
	public static void main(String[] args){
		int[][] score = new int[3][3];
		String[] course ={"java","c#","sql"};
		Scanner input = new Scanner(System.in);
		for(int i=0;i<score.length;i++){
			for(int j=0;j<course.length;j++){
				System.out.print("�������"+(i+1)+"��ѧ����"+course[j]+"�ɼ�:");
				score[i][j] = input.nextInt();
			}
		}
		System.out.print("\t\t");
		for(int i=0;i<course.length;i++){
			System.out.print(course[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<score.length;i++){
			System.out.print("��"+(i+1)+"��ѧ��\t");
			for(int j=0;j<course.length;j++){
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}