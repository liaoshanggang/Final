class Student{
	String stuName;
	int stuAge;
	int stuSex;
	int stuGrade;
	
	//�������η������ڿ���ֱ̨�����
	public void learn(){
		System.out.println(stuName+"�����������Σ�");
	}
	//����д��ҵ�ķ���������ʱ�䣬�����ַ���
	public String doHomework(int hour){
		return "�����Ǳ���ʱ�䣺"+hour+"�㣬"+stuName+"����д��ҵ��";
	}
}
public class TestStudent{
	public static void main(String[] args){
		Student wangYun = new Student();
		
		System.out.println("δ��ֵǰ��ѧ��������"+wangYun.stuName);
		System.out.println("δ��ֵǰ��ѧ�����䣺"+wangYun.stuAge);
		System.out.println("δ��ֵǰ��ѧ���Ա�"+wangYun.stuSex);
		System.out.println("δ��ֵǰ��ѧ����ͣ�"+wangYun.stuGrade);
		wangYun.stuName = "����";
		wangYun.stuAge = 24;
		wangYun.stuSex = 1;//1�����У�2����Ů
		wangYun.stuGrade = 4;//
		wangYun.learn();
		String rstString = wangYun.doHomework(22);
		System.out.println(rstString);
		System.out.println("��ֵ���ѧ��������"+wangYun.stuName);
		System.out.println("��ֵ���ѧ�����䣺"+wangYun.stuAge);
		System.out.println("��ֵ���ѧ���Ա�"+wangYun.stuSex);
		System.out.println("��ֵ���ѧ����ͣ�"+wangYun.stuGrade);
	}
}