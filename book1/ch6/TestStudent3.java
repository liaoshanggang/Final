
public class TestStudent3{
	public static void main(String[] args){
		Student wangYun = new Student();
		
		wangYun.setStuName("����");
		wangYun.setStuAge(24);
		wangYun.setStuSex(1);//1�����У�2����Ů
		wangYun.setStuGrade(4);//
		wangYun.learn();
		String rstString = wangYun.doHomework(22);
		System.out.println(rstString);
	}
}