class TestString2{
	public static void main(String[] args){
		// String stuName1 = new String("����");
		//String
		// char[] charArray = {'��','��','��'};
		// String stuName2 = new String(charArray);
		// String stuName3 = new String (charArray,1,2);
		// System.out.println(stuName1);
		// System.out.println(stuName2);
		// System.out.println(stuName3);
		
		//���ַ�����������һЩ���ݣ�
		String stuName1 = new String("����");
		String stuName2 = stuName1.concat("ͬѧ");
		System.out.println(stuName1);
		System.out.println(stuName2);
	}
}