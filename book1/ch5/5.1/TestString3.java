class TestString3{
	public static void main(String[] args){
		String stuName1 = new String("王云");
		System.out.println(stuName1);
		stuName1 = "刘静涛";//栈内存中的变量指向堆内存中的变量
		System.out.println(stuName1);
	}
}