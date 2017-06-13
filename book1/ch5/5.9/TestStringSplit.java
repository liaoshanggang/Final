class TestStringSplit{
	public static void main(String[] args){
		String st = "九寨沟、昆明、三亚、黄山";
		System.out.println("***原字符串*****"+st);
		String[] splitStr = st.split("、");
		System.out.println("*****拆分后格式****");
		for(int i=0;i<splitStr.length;i++){
			System.out.println("我想去："+splitStr[i]);
		}
		
	}
}