public class TestStudent6{
	public static void main(String[] args){
		//ʹ�ô��εĹ��췽��������wangYunѧ������󲢳�ʼ������
		// Student leiJing = new Student();//����
		Student wangYun = new Student("����",22,1,4);
		Student liuJT = new Student("������",21,2);
		Student nanTH = new Student("���컪",1);
		
		wangYun.learn();
		String rstString = wangYun.doHomework(22);
		System.out.println(rstString);
		
		liuJT.learn();
		System.out.println(liuJT.getStuName()+" ���ڶ���ѧ"+liuJT.getStuGrade()+"�꼶");
		
		System.out.println(nanTH.doHomework(23));
	}
}