class TestStringConcat{
	public static void main(String[] args){
		//ʹ��"+"�����ַ�������
		System.out.println("ʹ��'+'�����ַ�������");
		String s1 = "����";
		s1 = s1 + ",����ʦ��";
		sop(s1);
		//ʹ��public String concat(String str)��������
		System.out.println("ʹ��public String concat(String str)��������");
		String s2 = "����";
		s2.concat("������ʦ��");
		String s3 = s2.concat(",����ʦ��");
		sop(s2);
		sop(s3);
	}
	public static void sop(Object q){
		System.out.println(q);
	}
}