/**
Java������������ת��
*/
class TestConvert 
{
	public static void main(String[] args) 
	{
		int i1 = 222;
		int i2 = 333;
		double d1 = (i1+i2)*2.9;//ϵͳ��ת��Ϊdouble������
		float f1 = (float)((i1+i2)*2.9);
		System.out.println(d1);
		System.out.println(f1);

		byte b1 = 88;
		byte b2 = 99;
		byte b3 = (byte)(b1+b2);
		System.out.println("88+99="+b3);//ǿ������ת�������ݽ�����

		double d2 = 5.1E88;
		float f2 = (float)d2;
		System.out.println(f2);

		float f3 = 3.14F;
		f3 = f3 +0.05F;
		
		System.out.println("3.14F+0.05F="+f3);

		System.out.println("Hello World!");
	}
}
