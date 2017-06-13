/**
思路：
（1）将Java工程师资料设置为成员变量，能被各方法调用。
（2）使用方法调用重新组织《蓝桥系统》的结构，使用方法实现显示主界面以及实现各模块功能的代码。
（3）原先“计算Java工程师的月薪”功能中需要用户输入的部分内容，调整到“输入Java工程师资料”功能中输入。
（4）在“输入Java工程师资料”前需要判断是否已输入，如果已输入则输出提示信息；
	在“计算Java工程师的月薪”前需要判断是否已输入Java工程师资料，如果未输入则输出提示信息。可以通过status这个布尔值判断Java工程师资料是否已经输入完毕。
（5）在“输入Java工程师资料”时，需要根据需求对输入进行条件判断。

*/
import java.util.Scanner;
class JavaEngineer{
	static int engNo = -1;	//Java工程师编号————编号不能为负值
	static String engName = "";//Java工程师姓名————姓名不能为空
	static int engSex = -1;	//Java工程师性别（1代表男，2代表女）————性别只能输入1或2
	static int engEdu = -1;	//Java工程师学历（1代表大专，2代表本科，3代表硕士，4代表博士，5代表其他）————学历只能输入1、2、3、4、5
	
	static int basSalary = 3000;	//Java工程师底薪————底薪不能为负值
	static double insurance = 3000*0.105; //Java工程师月应扣保险数————不能为负值
	//以下为Java工程师月工作资料，在计算Java工程师月薪时输入
	static int comResult = 100;//Java工程师工作完成分数（最小值为0，最大值为150）
	static double workDay = 100;//Java工程师月实际完成天数————数值范围为1~31
	static double engSalary = 0.0;//Java工程师工资
	
	static int userSel;
	static boolean status = false;//表示Java工程师资料是否输入完毕
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		while(true){
			
			userSel = showMenu();
			switch(userSel){
				case 0:
					System.out.println("程序结束!");
					break;
				case 1:
					System.out.println("请现在输入Java工程师资料");
					inputEngInf();
					break;
				case 2:
					System.out.println("正删除Java工程师资料...");
					deleteEngInf();
					break;
				case 3:
					System.out.println("正查询Java工程师的资料...");
					searchEngInf();
					break;
				case 4:
					System.out.println("正修改Java工程师的资料...");
					break;
				case 5:
					calEngSalary();
					break;
				case 6:
					System.out.println("本模块未实现");
					break;
				case 7:
					System.out.println("本模块未实现");
					break;
				case 8:
					System.out.println("本模块未实现");
					break;
				case 9:
					System.out.println("本模块未实现");
					break;
				case 10:
					System.out.println("本模块未实现");
					break;
				case 11:
					System.out.println("本模块未实现");	
					break;
				default:
					System.out.println("数据输入错误!");
					break;
			}
			if(userSel==0){
				break;
			}
		}
	}
	//显示主菜单
	public static int showMenu(){
		System.out.println("-------------------------------------------------------");
		System.out.println("|                蓝桥计划Java工程师管理系统           |");
		System.out.println("-------------------------------------------------------");
		System.out.println("1.输入Java工程师资料");
		System.out.println("2.删除指定Java工程师资料");
		System.out.println("3.查询Java工程师资料");
		System.out.println("4.修改Java工程师资料");
		System.out.println("5.计算Java工程师资料");
		System.out.println("6.保存新添加的工程师资料");
		System.out.println("7.对Java工程师信息排序（1编号升序，2姓名升序）");
		System.out.println("8.输出所有Java工程师信息");
		System.out.println("9.清空所有Java工程师数据");
		System.out.println("10.打印Java工程师数据报表");
		System.out.println("11.从文件重新导入Java工程师数据");
		System.out.println("0.结束（编辑工程师信息后提示保存）");
		System.out.print("请输入您的选择：");
		userSel = input.nextInt();
		return userSel;
	}
	//输入Java工程师资料
	public static void inputEngInf(){
		if(status==true){
			System.out.println("Java工程师资料已输入完毕，可以进行4进行修改!");
		}else{
			while(!status){
				System.out.print("请输入Java工程师的编号：");
				engNo = input.nextInt();
				if(engNo<0){
					status = false;
					System.out.println("Java工程师编号不能为负值!");
					continue;
				}else{
					status = true;
				}
				
				System.out.print("请输入Java工程师的姓名：");
				engName = input.next();
				if(engName.length()==0){
					status = false;
					System.out.println("Java工程师名字不能为空!");
					continue;
				}else{
					status = true;
				}
				
				System.out.print("请输入Java工程师的性别：（1代表男，2代表女）");
				engSex = input.nextInt();
				if(engSex!=1&&engSex!=2){
					status = false;
					System.out.println("性别只能输入1或2!");
					continue;
				}else{
					status = true;
				}
				
				System.out.print("请输入Java工程师的学历：（1代表大专，2代表本科，3代表硕士，4代表博士，5代表其他）");
				engEdu = input.nextInt();
				if(engEdu!=1&&engEdu!=2&&engEdu!=3&&engEdu!=4&&engEdu!=5){
					status = false;
					System.out.println("学历只能输入1、2、3、4、5");
					continue;
				}else{
					status = true;
				}
				
				System.out.print("请输入Java工程师底薪：");
				basSalary = input.nextInt();
				if(basSalary<=0){
					status = false;
					System.out.println("Java工程师的底薪不能为负值!");
					continue;
				}else{
					status = true;
				}
				
				System.out.print("请输入Java工程师月应扣保险金额：");
				insurance = input.nextDouble();
				if(insurance<=0){
					status = false;
					System.out.println("Java工程师的月应扣保险金额不能为负值");
					continue;
				}else{
					status = true;
				}
			}
		}
	}
	//删除指定Java工程师资料
	public static void deleteEngInf(){
		
	}
	//查询Java工程师资料
	public static void searchEngInf(){
		
	}
	//修改Java工程师资料
	public static void modifyEngInf(){
		
	}
	//计算Java工程师资料
	public static void calEngSalary(){
		if(status=false){
			System.out.println("请输入Java工程师资料未输入或已删除，不能计算!");
		}else{
			while(true){
				System.out.print("请输入Java工程师工作完成分数（最小值为0，最大值为150）");
				comResult = input.nextInt();
				if(comResult<0||comResult>150){
					System.out.println("输入错误，请重新输入!");
					continue;
				}else{
					break;
				}
			}
			while(true){
				System.out.print("请输入Java工程师月工作完成天数（最小值为0，最大值为31）：");
				workDay = input.nextInt();
				if(workDay<0||workDay>31){
					System.out.println("输入错误，请重新输入!");
					continue;
				}else{
					break;
				}
			}
			engSalary = calEngSalaryValue(basSalary,comResult,workDay,insurance);
			System.out.println("Java工程师"+engName+"月薪为："+engSalary);
		}
	}
	
	public static double calEngSalaryValue(int basSalary,int comResult,double workDay,double insurance){
		return basSalary+basSalary*0.25*comResult/100+15*workDay-insurance;
	}

	
	// public static void subFun5(){
		// double engSalary = 0.0;//Java工程师月薪
		// int basSalary = 10000;//月底薪
		// int comResult = 100;
		// double workDay = 22;
		// double insurance = basSalary*0.105;
		
		// Scanner input = new Scanner(System.in);
		// System.out.print("请输入Java工程师底薪：");
		// basSalary = input.nextInt();
		// System.out.print("请输入Java工程师月工作完成分数（最小值为0，最大值为150）：");
		// comResult = input.nextInt();
		// System.out.print("请输入Java工程师实际工作天数：");
		// workDay = input.nextDouble();0
		// System.out.print("请输入Java工程师月应扣保险数：");
		// insurance = input.nextDouble();
		
		// engSalary = basSalary + basSalary*0.25*comResult/100 + 15*workDay + insurance;
		// System.out.println("java工程师月薪为："+engSalary);
	// }
}