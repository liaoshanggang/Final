public class Student{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;
	//构造方法，用户初始化的对象的属性
	public Student(String name,int age,int sex,int grade){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}
	//构造方法，用户初始化的对象的属性（不带年纪参数，设置年纪默认值为4）
	public Student(String name,int age,int sex){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = 4;
	}
	//构造方法，用户初始化的对象的属性（）
	//不带年龄、年纪参数，设置年龄默认值22，年纪默认值为4
	public Student(String name,int sex){
		this.stuName = name;
		this.stuAge = 22;
		this.stuSex = sex;
		this.stuGrade = 4;
	}
	//无参构造方法
	public Student(){
		
	}
	//其他
	//传入参数name、age、sex、和grade的值，输出结果
	public void learn(String name,int age,int sex,int grade){
		String sexStr =(sex==1)?"男生":"女生";
		System.out.println(age+"岁的大学"+grade+"年纪"+sexStr+name+"正在认真听课！");
	}
	//传入参数name、age、和sex的值，grade值取4，输出结果
	public void learn(String name,int age,int sex){
			learn(name,age,sex,4);
	}
	//传入参数name和sex的值，age的值取22，grade值取4，输出结果
	public void learn(String name,int sex){
		learn(name,22,sex,4);
	}
	//无参的听课方法，使用成员变量的值作为参数
	public void learn(){
		learn(this.stuName,this.stuAge,this.stuSex,this.stuGrade);
	}
	public static void main(String[] args){
		Student stu = new Student("王云",22,1,4);
		stu.learn("刘静涛",21,2,3);
		stu.learn("南天华",20,1);
		stu.learn("雷静",2);
		stu.learn();
	}
	
}