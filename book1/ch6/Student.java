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
	//�������η������ڿ���ֱ̨�����
	public void learn(){
		System.out.println(stuName+"�����������Σ�");
	}
	//����д��ҵ�ķ���������ʱ�䣬�����ַ���
	public String doHomework(int hour){
		return "�����Ǳ���ʱ�䣺"+hour+"�㣬"+this.stuName+"����д��ҵ��";
	}
}