/*	
4�������ĸ�������a='A';b='B',c='C',d='D';���ڱ��ʵ��a��d�����е�
ֵ������b��c�е�ֵ������������a��b��c��d�е�ֵ��
*/
class TestTask4
{
	public static void main(String[] args){
	char a = 'A';
	char b = 'B';
	char c = 'C';
	char d = 'D';
	char temp;
	temp = a;
	a = b;
	b = temp;

	temp = c;
	c = d;
	d = temp;
	System.out.println("�����������Ϊ a:"+a+" b:"+b+" c:"+c+" d:"+d);


	
	}
}