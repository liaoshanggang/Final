class StringMethod{
	public static void main(String[] args){
		String st = "";
		if(st.isEmpty()){
			System.out.println("这个字符串为空");
		}else{
			System.out.println("这个字符串不为空");
		}
		String st1 = "wjefjpoweif";
		System.out.println("将字符串转换为一个新的字符数组"+st1);
		char[] ch = st1.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		
		String st2 = "jsdfls";
		String st3 = "ewlrfjl";
		int rank = st2.compareTo(st3);
		if(rank<0){
			System.out.println(st2+"在"+st3+"之前");
		}else if(rank>0){
			System.out.println(st2+"在"+st3+"之后");
		}else{
			System.out.println("这两个字符串相等");
		}
	}
}