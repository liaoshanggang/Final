public class Student{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;
	//���췽�����û���ʼ�����������
	public Student(String name,int age,int sex,int grade){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}
	//���췽�����û���ʼ����������ԣ�������Ͳ������������Ĭ��ֵΪ4��
	public Student(String name,int age,int sex){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = 4;
	}
	//���췽�����û���ʼ�����������
	//�������䡢��Ͳ�������������Ĭ��ֵΪ22�����Ĭ��ֵΪ4
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
	//�������η������ڿ���ֱ̨�����
	public void learn(){
		System.out.println(stuName+"�����������Σ�");
	}
	//����д��ҵ�ķ���������ʱ�䣬�����ַ���
	public String doHomework(int hour){
		return "�����Ǳ���ʱ�䣺"+hour+"�㣬"+this.stuName+"����д��ҵ��";
	}
}