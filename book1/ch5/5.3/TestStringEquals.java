class TestStringEquals{
	public static void main(String[] args){
		String s1 = "Java����";
		String s2 = "Java����";
		System.out.println(s1==s2);//==�Ƚ϶���ĵ�ַ�Ƿ�һ��
		System.out.println(s1.equals(s2));//equals�Ƚ�����String�ַ����������Ƿ�һ��
		
		String s3 = new String("ǰ�˼���");
		String s4 = new String("ǰ�˼���");
		System.out.println(s3==s4);
		sop(s3.equals(s4));
	}
	public static void sop(Object q){
		System.out.println(q);
	}
}