
class TestStringBuffer{
	public static void main(String[] args){
		System.out.println("����");
		StringBuffer strB1 = new StringBuffer();
		System.out.println("new StringBuffer()��������ĳ���Ϊ��"+strB1.length());
		//ʹ��StringBuffer(String str)��������������
		StringBuffer strB2 = new StringBuffer("������");
		System.out.println("new StringBuffer(\"������\")��������ĳ���Ϊ��"+strB2.length());
		System.out.println("strB2�������Ϊ��"+strB2);
		
		System.out.println("ʹ��append����׷���ַ���");
		strB2.append(",���ã�");
		System.out.println(strB2);
		strB2.insert(3,"����ʦ");
		System.out.println(strB2);
		// StringBuffer strB1 = new StringBuffer();
		
		// System.out.println(strB1.length());
		// StringBuffer strB2 = new StringBuffer("�Ϳ���");
		// String str = "sdfsefsd";
		// strB2.append(str);
		// System.out.println(strB2);
		// strB1.append(strB2);
		// System.out.println(strB1);
		}
}