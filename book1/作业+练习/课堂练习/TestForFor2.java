import java.util.Scanner;
class TestForFor2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入显示的行数：");
		int row = input.nextInt();
		
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		
	}
}