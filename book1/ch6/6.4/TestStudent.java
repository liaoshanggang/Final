class Student{
	String stuName;
	int stuAge;
	int stuSex;
	int stuGrade;
	
	//定义听课方法，在控制台直接输出
	public void learn(){
		System.out.println(stuName+"正在认真听课！");
	}
	//定义写作业的方法，输入时间，返回字符串
	public String doHomework(int hour){
		return "现在是北京时间："+hour+"点，"+stuName+"正在写作业！";
	}
}
public class TestStudent{
	public static void main(String[] args){
		Student wangYun = new Student();
		
		System.out.println("未赋值前的学生姓名："+wangYun.stuName);
		System.out.println("未赋值前的学生年龄："+wangYun.stuAge);
		System.out.println("未赋值前的学生性别："+wangYun.stuSex);
		System.out.println("未赋值前的学生年纪："+wangYun.stuGrade);
		wangYun.stuName = "王云";
		wangYun.stuAge = 24;
		wangYun.stuSex = 1;//1代表男，2代表女
		wangYun.stuGrade = 4;//
		wangYun.learn();
		String rstString = wangYun.doHomework(22);
		System.out.println(rstString);
		System.out.println("赋值后的学生姓名："+wangYun.stuName);
		System.out.println("赋值后的学生年龄："+wangYun.stuAge);
		System.out.println("赋值后的学生性别："+wangYun.stuSex);
		System.out.println("赋值后的学生年纪："+wangYun.stuGrade);
	}
}