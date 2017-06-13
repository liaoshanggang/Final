import java.util.Scanner;
class TestForFor{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入多少行星：");
		int row = input.nextInt();
		
		for(int i=0;i<row;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}