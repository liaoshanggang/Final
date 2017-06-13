public class TestStudent6{
	public static void main(String[] args){
		//使用带参的构造方法，创建wangYun学生类对象并初始化对象
		// Student leiJing = new Student();//错误
		Student wangYun = new Student("王云",22,1,4);
		Student liuJT = new Student("刘静涛",21,2);
		Student nanTH = new Student("南天华",1);
		
		wangYun.learn();
		String rstString = wangYun.doHomework(22);
		System.out.println(rstString);
		
		liuJT.learn();
		System.out.println(liuJT.getStuName()+" 正在读大学"+liuJT.getStuGrade()+"年级");
		
		System.out.println(nanTH.doHomework(23));
	}
}