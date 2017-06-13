import java.util.Scanner;
class EngRegister{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String engName,p1,p2;
		boolean resp = false;//标识是否成功
		
		do{
			System.out.println("请输入Java工程师用户名：");
			engName = input.next();
			System.out.println("请输入密码：");
			p1 = input.next();
			System.out.println("请再次输入密码：");
			p2 = input.next();
			resp = verify(engName,p1,p2);
		}while(!resp);
		
		
	}	
	//使用verify方法对用户名，密码进行验证，返回是否成功
	public static boolean verify(String name,String pwd1,String pwd2){
		boolean flag = false;
		if(name.length()<6||pwd1.length()<8){
			System.out.println("用户名不能小于6，密码长度不能小于8");
		}else if(!pwd1.equals(pwd2)){
			System.out.println("两次输入的密码不相同！");
		}else{
			System.out.println("注册成功！请牢记用户名和密码。");
			flag = true;
		}
		return flag;
	}
}