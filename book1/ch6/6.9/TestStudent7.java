public class TestStudent7{
	public static void main(String[] args){
		
		Student temp = new Student();
		System.out.println(temp.getStuName()+"���ڶ���ѧ"+temp.getStuGrade()+"�꼶");
		//���췽����ʼ����Ա�����ڳ�ʼ�����ʼ��֮��
		Student wangYun = new Student("����",22,1,4);
		System.out.println(wangYun.getStuName()+"���ڶ���ѧ"+wangYun.getStuGrade()+"�꼶");
	}
}