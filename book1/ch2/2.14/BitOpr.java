class BitOpr{
	public static void main(String[] args){
		int a = 128;
		int b = 129;
		System.out.println("a��b��λ��Ľ���ǣ�"+(a&b));
		System.out.println("a��b��λ��Ľ���ǣ�"+(a|b));

		System.out.println("a��b��λ�ǵĽ���ǣ�"+Integer.toBinaryString((~a)));
		System.out.println("a��b��λ���Ľ���ǣ�"+(a^b));

		int c = 5;
		
		int rst = c<<3;

		System.out.println("5������λ�Ľ���ǣ�"+rst);
	}
}