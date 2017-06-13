import java.util.Scanner;
public class TestStuTea{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		Teacher[] tea = new Teacher[2];//创建长度为2的数组tea，用于存放2个老师对象
		Student[] stu = new Student[4];//创建长度为4的数组stu,用于存放4个学生对象
		for(int i=0;i<tea.length;i++){
			System.out.println("请创建并输入第"+(i+1)+"个老师的基本信息：");
			tea[i] = createTeacher();
		}
		for(int i=0;i<stu.length;i++){
			System.out.println("请创建并输入第"+(i+1)+"个学生的基本信息：");
			stu[i] = createStudent();
		}
		//调用第一个老师讲课的方法，在控制台输出
		tea[0].teach();
		//依次调用所有学生听课的方法，在控制台输出
		for(int i=0;i<stu.length;i++){
			stu[i].learn();
		}
		//依次调用所有学生写作业的方法，在控制台输出
		for(int i=0;i<stu.length;i++){
			String tempStu = stu[i].doHomework(20);
			System.out.println(tempStu);
		}
		for(int i=0;i<stu.length;i++){
			//调用第二个老师批改作业的方法，依次批改所有学生的作业，在控制台输出
			tea[1].checkHomework(stu[i]);
		}
	}
	//创建老师对象并赋值
	public static Teacher createTeacher(){
		Teacher tea = new Teacher();
		System.out.print("请输入老师姓名：");
		tea.teaName = input.next();
		System.out.print("请输入老师专业：");
		tea.teaSpeciality = input.next();
		System.out.print("请输入老师所教授的课程：");
		tea.teaCourse = input.next();
		System.out.print("请输入老师教龄：");
		tea.teaYears = input.nextInt();
		return tea;
	}
	//创建学生对象并赋值
	public static Student createStudent(){
		Student stu = new Student();
		System.out.print("请输入学生姓名：");
		stu.stuName = input.next();
		System.out.print("请输入学生年龄：");
		stu.stuAge = input.nextInt();
		System.out.print("请输入学生性别数值（1代表男，2代表女）：");
		stu.stuSex = input.nextInt();
		System.out.print("请输入学生年级：");
		stu.stuGrade = input.nextInt();
		return stu;
	}
	
}
class Teacher{
	String teaName;//老师姓名
	String teaSpeciality;//老师专业
	String teaCourse;//老师所讲授的课程
	int teaYears;//老师教龄
	//定义讲课方法，在控制台直接输出
	public void teach(){
		System.out.println(teaName+"正在辛苦："+teaSpeciality+"课程！");
	}
	//定义批改作业的方法，输入值为一个学生对象，在控制台直接输出结果
	public void checkHomework(Student stu){
		System.out.println("讲授："+teaCourse+"课程的老师："+teaName+" 已经批改完毕："+stu.stuName+" 的作业");
	}
}
class Student{
	String stuName;
	int stuAge;
	int stuSex;
	int stuGrade;
	//定义听课的方法，在控制台直接输出
	public void learn(){
		System.out.println(stuName+"正在认真听课！");
	}
	//定义写作业的方法，输入时间，返回字符串
	public String doHomework(int hour){
		return "现在是北京时间："+hour+"点，"+stuName + "正在写作业！";
	}
}