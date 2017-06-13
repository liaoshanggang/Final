/* 4、一个推箱游戏（选做）。 */
import java.util.Scanner;
class TestArray2_4{
	public static void main(String[] args){
		int[][] map = new int[6][6];
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				map[i][j] = 0;
			}
		}
		//当前箱子坐标
		int x = 1;
		int y = 1;
		//输入用户操作
		char oper = 'o';
		int k = 1;//记录步数,只有在图中移动有效
		Scanner input = new Scanner(System.in);
		while(oper!='q'){
			//当遇到边界想超出的话保持原状
			if((x==-1)||(y==-1)||(x==(map.length))||(y==(map.length))){
				switch(oper){
					case 'w'://上移
						x = x+1;
					break;
					case 's'://下移
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
			map[x][y] = 1;//置1表示当前位置，
			System.out.println("第"+k+"步");
			map(map);//显示每走一步的画面
			System.out.println("请输入您的操作（w为上移，s为下移，d为右移，a为左移，q结束游戏）：");
			oper = input.next().charAt(0);
			//移动后的坐标
			switch(oper){
					case 'w'://上移
						map[x][y] = 0;//把走过的点为0
						x = x-1;
					break;
					case 's'://下移
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
	//初始地图与每走一步后更新后需要用的地图
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

/* 3、杨辉三角
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
/*2、定义一个二维数组，int[3][4]，要求是循环输入12个整数，放入到数组中
，然后使用嵌套循环找到这个数组中的最大值。*/
//import java.util.Scanner;
class TestArray2_2{
	public static void main(String[] args){
		int[][] arr = new int[3][4];
		Scanner input = new Scanner(System.in);
		int k=1;//记录输入了多少个数
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print("请输入第"+k+"个整数：");
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
		System.out.println("这个数组中的最大值为："+max);
	}
}
//import java.util.Scanner;
class TestArray2_1{
	/* 1、定义一个二维数组，用来记录3个学生的java,c#,sql三门功课的成绩，
	二维数组的一行记录一个人的成绩，要求循环输入，最后输出格式如下：
				java	c#	sql
	第1名学生	89		79	98
	第2名学生	99		80	100
	第3名学生	79		99	87 */
	public static void main(String[] args){
		int[][] score = new int[3][3];
		String[] course ={"java","c#","sql"};
		Scanner input = new Scanner(System.in);
		for(int i=0;i<score.length;i++){
			for(int j=0;j<course.length;j++){
				System.out.print("请输入第"+(i+1)+"个学生的"+course[j]+"成绩:");
				score[i][j] = input.nextInt();
			}
		}
		System.out.print("\t\t");
		for(int i=0;i<course.length;i++){
			System.out.print(course[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<score.length;i++){
			System.out.print("第"+(i+1)+"名学生\t");
			for(int j=0;j<course.length;j++){
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}