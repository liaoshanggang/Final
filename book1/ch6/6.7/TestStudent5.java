public class TestStudent5{
	public static void main(String[] args){
		//ʹ�ô��εĹ��췽��������wangYunѧ������󲢳�ʼ������
		Student wangYun = new Student("����",22,1,4);
		wangYun.learn();
		String rstString = wangYun.doHomework(22);
		System.out.println(rstString);
	}
}