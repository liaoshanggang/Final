public class Student{
	private String stuName = "";
	private int stuAge = -1;
	private int stuSex = -1;
	private int stuGrade = -1;
	//使用初始化块初始化
	{
		System.out.println("使用初始化块初始化");
		this.stuName = "累静";
		this.stuAge = 22;
		this.stuAge = 2;
		this.stuGrade = 4;
	}
	//无参构造方法
	public Student(){
		System.out.println("使用无参构造函数初始化");
	}
	
	//构造方法，用户初始化对象的成员变量
	public Student(String name,int age,int sex,int grade){
		System.out.println("使用有参数构造函数初始化");
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}
	
	public String getStuName(){
		return this.stuName;
	}
	
	public int getStuAge(){
		return this.stuAge;
	}
	
	public int getStuSex(){
		return this.stuSex;
	}
	
	public int getStuGrade(){
		return this.stuGrade;
	}
	//定义听课方法，在控制台直接输出
	public void learn(){
		System.out.println(stuName+"正在认真听课！");
	}
	//定义写作业的方法，输入时间，返回字符串
	public String doHomework(int hour){
		return "现在是北京时间："+hour+"点，"+this.stuName+"正在写作业！";
	}
}