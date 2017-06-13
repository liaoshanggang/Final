class BitOpr{
	public static void main(String[] args){
		int a = 128;
		int b = 129;
		System.out.println("a和b按位与的结果是："+(a&b));
		System.out.println("a和b按位或的结果是："+(a|b));

		System.out.println("a和b按位非的结果是："+Integer.toBinaryString((~a)));
		System.out.println("a和b按位异或的结果是："+(a^b));

		int c = 5;
		
		int rst = c<<3;

		System.out.println("5左移三位的结果是："+rst);
	}
}