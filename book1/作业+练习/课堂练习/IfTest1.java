import java.util.Scanner;
class IfTest1{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("please input your pwd1:");
		int pwd1 = in.nextInt();
		System.out.print("please input your pwd2:");
		int pwd2 = in.nextInt();
		if(pwd1==123){
			if(pwd2==456){
				System.out.println("Success!");
			}else{
				System.out.println("Fail!");
			}
		}else{
			System.out.println("Fail!");
		}
		
	}
}