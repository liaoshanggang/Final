import java.util.Scanner;
import java.util.Random;
class TestForFor3{
	/* 
	3、剪刀石头布游戏(人机对战)
	*/
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		String mine = "";
		String machine = "";
		int i = 0;//记录机器出的手势
		int k = 0;//记录玩家出的手势
		int j = 1;//记录玩家玩了多少局
		for(;;){
			System.out.println("============第"+j+"局===========");
			System.out.print("请输入你的手势：(输入0结束游戏)\n你出：");
			mine = input.next();
			if(mine.equals("剪刀")){
				k = 1;
			}else if(mine.equals("石头")){
				k = 2;
			}else if(mine.equals("布")){
				k = 3;
			}else{
				System.out.println("出错");
				if(mine.equals("0")){
					System.out.println("游戏结束");
					break;
				}
			}
			//机器随机出
			i = random.nextInt(3)+1;
			switch(i){
				case 1:
					machine = "剪刀";
					break;
				case 2:
					machine = "石头";
					break;
				case 3:
					machine = "布";
					break;
			}
			System.out.println("机器出："+machine);
			//判断胜负
			if(k==i){
				System.out.println("平局");
			}else if((k==1&&i==3)||(k==2&&i==1)|(k==3&&i==2)){
				System.out.println("你赢了");
			}else{
				System.out.println("你输了");
			}
			j++;
		}
	}
}
class TestForFor1{
	/* 1、输出如下图形
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
	/* 	2、输出如下图形
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
