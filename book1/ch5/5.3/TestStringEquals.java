class TestStringEquals{
	public static void main(String[] args){
		String s1 = "Java基础";
		String s2 = "Java基础";
		System.out.println(s1==s2);//==比较对象的地址是否一致
		System.out.println(s1.equals(s2));//equals比较两个String字符串的内容是否一致
		
		String s3 = new String("前端技术");
		String s4 = new String("前端技术");
		System.out.println(s3==s4);
		sop(s3.equals(s4));
	}
	public static void sop(Object q){
		System.out.println(q);
	}
}