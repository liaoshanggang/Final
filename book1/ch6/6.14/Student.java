public class Student{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;
	//���췽�����û���ʼ���Ķ��������
	public Student(String name,int age,int sex,int grade){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}
	//���췽�����û���ʼ���Ķ�������ԣ�������Ͳ������������Ĭ��ֵΪ4��
	public Student(String name,int age,int sex){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = 4;
	}
	//���췽�����û���ʼ���Ķ�������ԣ���
	//�������䡢��Ͳ�������������Ĭ��ֵ22�����Ĭ��ֵΪ4
	public Student(String name,int sex){
		this.stuName = name;
		this.stuAge = 22;
		this.stuSex = sex;
		this.stuGrade = 4;
	}
	//�޲ι��췽��
	public Student(){
		
	}
	//����
	//�������name��age��sex����grade��ֵ��������
	public void learn(String name,int age,int sex,int grade){
		String sexStr =(sex==1)?"����":"Ů��";
		System.out.println(age+"��Ĵ�ѧ"+grade+"���"+sexStr+name+"�����������Σ�");
	}
	//�������name��age����sex��ֵ��gradeֵȡ4��������
	public void learn(String name,int age,int sex){
			learn(name,age,sex,4);
	}
	//�������name��sex��ֵ��age��ֵȡ22��gradeֵȡ4��������
	public void learn(String name,int sex){
		learn(name,22,sex,4);
	}
	//�޲ε����η�����ʹ�ó�Ա������ֵ��Ϊ����
	public void learn(){
		learn(this.stuName,this.stuAge,this.stuSex,this.stuGrade);
	}
	public static void main(String[] args){
		Student stu = new Student("����",22,1,4);
		stu.learn("������",21,2,3);
		stu.learn("���컪",20,1);
		stu.learn("�׾�",2);
		stu.learn();
	}
	
}