class TestString2{
	public static void main(String[] args){
		// String stuName1 = new String("王云");
		//String
		// char[] charArray = {'刘','静','涛'};
		// String stuName2 = new String(charArray);
		// String stuName3 = new String (charArray,1,2);
		// System.out.println(stuName1);
		// System.out.println(stuName2);
		// System.out.println(stuName3);
		
		//在字符串后面增加一些内容，
		String stuName1 = new String("王云");
		String stuName2 = stuName1.concat("同学");
		System.out.println(stuName1);
		System.out.println(stuName2);
	}
}