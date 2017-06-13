/*	
4、定义四个变量，a='A';b='B',c='C',d='D';现在编程实现a与d变量中的
值交换，b与c中的值交换。最后输出a、b、c、d中的值。
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
	System.out.println("交换后的数据为 a:"+a+" b:"+b+" c:"+c+" d:"+d);


	
	}
}