class TestStringSplit{
	public static void main(String[] args){
		String st = "��կ�������������ǡ���ɽ";
		System.out.println("***ԭ�ַ���*****"+st);
		String[] splitStr = st.split("��");
		System.out.println("*****��ֺ��ʽ****");
		for(int i=0;i<splitStr.length;i++){
			System.out.println("����ȥ��"+splitStr[i]);
		}
		
	}
}