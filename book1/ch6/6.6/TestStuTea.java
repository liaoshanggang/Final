import java.util.Scanner;
public class TestStuTea{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		Teacher[] tea = new Teacher[2];//��������Ϊ2������tea�����ڴ��2����ʦ����
		Student[] stu = new Student[4];//��������Ϊ4������stu,���ڴ��4��ѧ������
		for(int i=0;i<tea.length;i++){
			System.out.println("�봴���������"+(i+1)+"����ʦ�Ļ�����Ϣ��");
			tea[i] = createTeacher();
		}
		for(int i=0;i<stu.length;i++){
			System.out.println("�봴���������"+(i+1)+"��ѧ���Ļ�����Ϣ��");
			stu[i] = createStudent();
		}
		//���õ�һ����ʦ���εķ������ڿ���̨���
		tea[0].teach();
		//���ε�������ѧ�����εķ������ڿ���̨���
		for(int i=0;i<stu.length;i++){
			stu[i].learn();
		}
		//���ε�������ѧ��д��ҵ�ķ������ڿ���̨���
		for(int i=0;i<stu.length;i++){
			String tempStu = stu[i].doHomework(20);
			System.out.println(tempStu);
		}
		for(int i=0;i<stu.length;i++){
			//���õڶ�����ʦ������ҵ�ķ�����������������ѧ������ҵ���ڿ���̨���
			tea[1].checkHomework(stu[i]);
		}
	}
	//������ʦ���󲢸�ֵ
	public static Teacher createTeacher(){
		Teacher tea = new Teacher();
		System.out.print("��������ʦ������");
		tea.teaName = input.next();
		System.out.print("��������ʦרҵ��");
		tea.teaSpeciality = input.next();
		System.out.print("��������ʦ�����ڵĿγ̣�");
		tea.teaCourse = input.next();
		System.out.print("��������ʦ���䣺");
		tea.teaYears = input.nextInt();
		return tea;
	}
	//����ѧ�����󲢸�ֵ
	public static Student createStudent(){
		Student stu = new Student();
		System.out.print("������ѧ��������");
		stu.stuName = input.next();
		System.out.print("������ѧ�����䣺");
		stu.stuAge = input.nextInt();
		System.out.print("������ѧ���Ա���ֵ��1�����У�2����Ů����");
		stu.stuSex = input.nextInt();
		System.out.print("������ѧ���꼶��");
		stu.stuGrade = input.nextInt();
		return stu;
	}
	
}
class Teacher{
	String teaName;//��ʦ����
	String teaSpeciality;//��ʦרҵ
	String teaCourse;//��ʦ�����ڵĿγ�
	int teaYears;//��ʦ����
	//���彲�η������ڿ���ֱ̨�����
	public void teach(){
		System.out.println(teaName+"�������ࣺ"+teaSpeciality+"�γ̣�");
	}
	//����������ҵ�ķ���������ֵΪһ��ѧ�������ڿ���ֱ̨��������
	public void checkHomework(Student stu){
		System.out.println("���ڣ�"+teaCourse+"�γ̵���ʦ��"+teaName+" �Ѿ�������ϣ�"+stu.stuName+" ����ҵ");
	}
}
class Student{
	String stuName;
	int stuAge;
	int stuSex;
	int stuGrade;
	//�������εķ������ڿ���ֱ̨�����
	public void learn(){
		System.out.println(stuName+"�����������Σ�");
	}
	//����д��ҵ�ķ���������ʱ�䣬�����ַ���
	public String doHomework(int hour){
		return "�����Ǳ���ʱ�䣺"+hour+"�㣬"+stuName + "����д��ҵ��";
	}
}