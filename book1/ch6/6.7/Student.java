public class Student{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;
	public Student(String name,int age,int sex,int grade){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
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