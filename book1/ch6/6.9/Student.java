public class Student{
	private String stuName = "";
	private int stuAge = -1;
	private int stuSex = -1;
	private int stuGrade = -1;
	//ʹ�ó�ʼ�����ʼ��
	{
		System.out.println("ʹ�ó�ʼ�����ʼ��");
		this.stuName = "�۾�";
		this.stuAge = 22;
		this.stuAge = 2;
		this.stuGrade = 4;
	}
	//�޲ι��췽��
	public Student(){
		System.out.println("ʹ���޲ι��캯����ʼ��");
	}
	
	//���췽�����û���ʼ������ĳ�Ա����
	public Student(String name,int age,int sex,int grade){
		System.out.println("ʹ���в������캯����ʼ��");
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
	//�������η������ڿ���ֱ̨�����
	public void learn(){
		System.out.println(stuName+"�����������Σ�");
	}
	//����д��ҵ�ķ���������ʱ�䣬�����ַ���
	public String doHomework(int hour){
		return "�����Ǳ���ʱ�䣺"+hour+"�㣬"+this.stuName+"����д��ҵ��";
	}
}