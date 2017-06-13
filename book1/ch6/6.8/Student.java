public class Student{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;
	//构造方法，用户初始化对象的属性
	public Student(String name,int age,int sex,int grade){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}
	//构造方法，用户初始化对象的属性（不带年纪参数，设置年纪默认值为4）
	public Student(String name,int age,int sex){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = 4;
	}
	//构造方法，用户初始化对象的属性
	//不带年龄、年纪参数，设置年龄默认值为22，年纪默认值为4
	public Student(String name,int sex){
		this.stuName = name;
		this.stuAge = 22;
		this.stuSex = sex;
		this.stuGrade = 4;
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