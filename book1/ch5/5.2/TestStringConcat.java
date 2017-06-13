class TestStringConcat{
	public static void main(String[] args){
		//使用"+"进行字符串连接
		System.out.println("使用'+'进行字符串连接");
		String s1 = "您好";
		s1 = s1 + ",江老师！";
		sop(s1);
		//使用public String concat(String str)方法连接
		System.out.println("使用public String concat(String str)方法连接");
		String s2 = "您好";
		s2.concat("，江老师！");
		String s3 = s2.concat(",江老师！");
		sop(s2);
		sop(s3);
	}
	public static void sop(Object q){
		System.out.println(q);
	}
}