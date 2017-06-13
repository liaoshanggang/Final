public class Student{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;
	public void setStuName(String name){
		this.stuName = name;
	}
	public String getStuName(){
		return this.stuName;
	}
	public void setStuAge(int age){
		this.stuAge = age;
	}
	public int getStuAge(){
		return this.stuAge;
	}
	public void setStuSex(int sex){
		this.stuSex = sex;
	}
	public int getStuSex(){
		return this.stuSex;
	}
	public void setStuGrade(int grade){
		this.stuGrade = grade;
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