/*
	3����������������a=6.89;b=8.9;���ڱ��ʵ��a��b�����е�ֵ������
	������a��b�е�ֵ��
*/
class TestTask3
{
	public static void main(String[] args){
	
		double a = 6.89;
		double b = 8.9;
		
		double temp;//������������������Ž���������
		temp = a;
		a = b;
		b = temp;
	
		System.out.println("a="+a+" b="+b);
	}
}