public class TestStudent5{
	public static void main(String[] args){
		//使用带参的构造方法，创建wangYun学生类对象并初始化对象
		Student wangYun = new Student("王云",22,1,4);
		wangYun.learn();
		String rstString = wangYun.doHomework(22);
		System.out.println(rstString);
	}
}