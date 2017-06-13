import java.util.Scanner;
class TestForFor1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入多少行星：");
		int row = input.nextInt();
		
		for(int i=1;i<=row;i++){
			for(int j=row;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}