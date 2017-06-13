public class TestStudent7{
	public static void main(String[] args){
		
		Student temp = new Student();
		System.out.println(temp.getStuName()+"正在读大学"+temp.getStuGrade()+"年级");
		//构造方法初始化成员变量在初始化块初始化之后
		Student wangYun = new Student("王云",22,1,4);
		System.out.println(wangYun.getStuName()+"正在读大学"+wangYun.getStuGrade()+"年级");
	}
}