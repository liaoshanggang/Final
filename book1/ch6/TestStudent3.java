
public class TestStudent3{
	public static void main(String[] args){
		Student wangYun = new Student();
		
		wangYun.setStuName("王云");
		wangYun.setStuAge(24);
		wangYun.setStuSex(1);//1代表男，2代表女
		wangYun.setStuGrade(4);//
		wangYun.learn();
		String rstString = wangYun.doHomework(22);
		System.out.println(rstString);
	}
}