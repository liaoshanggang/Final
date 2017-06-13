class TestStringMethod{
	public static void main(String[] args){
		String s1 = "blue brige";
		String s2 = "Blue brigeb";
		sop(s1.charAt(3));
		sop(s2.charAt(0));
		sop(s2.charAt(9));
		sop(s1.length());
		sop(s2.length());
		sop(s2.indexOf("e"));
		sop(s2.indexOf("b"));
		sop(s1.indexOf("b",3));
		sop(s1.equalsIgnoreCase(s2));
		
		String s = "我是学生，我在学Java!";
		String str = s.replace('我','你');
		sop(str);
		String sw1 = "独守空房了；受到激发";
		String str1 = sw1.replace('：','好');
		sop(str1);
	}
	public static void sop(Object q){
		System.out.println(q);
	}
}