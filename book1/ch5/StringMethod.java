class StringMethod{
	public static void main(String[] args){
		String st = "";
		if(st.isEmpty()){
			System.out.println("����ַ���Ϊ��");
		}else{
			System.out.println("����ַ�����Ϊ��");
		}
		String st1 = "wjefjpoweif";
		System.out.println("���ַ���ת��Ϊһ���µ��ַ�����"+st1);
		char[] ch = st1.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		
		String st2 = "jsdfls";
		String st3 = "ewlrfjl";
		int rank = st2.compareTo(st3);
		if(rank<0){
			System.out.println(st2+"��"+st3+"֮ǰ");
		}else if(rank>0){
			System.out.println(st2+"��"+st3+"֮��");
		}else{
			System.out.println("�������ַ������");
		}
	}
}