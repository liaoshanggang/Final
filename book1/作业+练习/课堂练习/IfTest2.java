/*第一男组：
1000
800
第二女组：
800
500
张三男1000
李四女500	
*/
import java.util.Scanner;
class IfTest2{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		char sex;
		int sport;
		System.out.print("请输入你的姓别(只能男或女)");
		sex = in.next().charAt(0);
		System.out.print("请输入你要参加的项目（1000 800 500）");
		sport = in.nextInt();
		if(sex == '男'){
			if(sport == 1000){
				System.out.println("1000米");
			}else{
				System.out.println("800米");
			}
		}else if(sex == '女'){
			if(sport == 800){
				System.out.println("800米");
			}else{
				System.out.println("500米");
			}
		}
	}
}