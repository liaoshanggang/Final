/**1������3�����α������ֱ���3��4��5���������ǵĺͣ�


2.��������������Ա��������ߣ�Ȼ�������еĸ�ʽ���
   С��
   ��
   18
   185.6

3��ѧԱ����3�ſγ̳ɼ����£�java��100;  sql=90;  html=99����д����ʵ��
   ��1��Java�κ�SQL�εķ���֮��
   ��2��3�ſε�ƽ����

4������һ���������������εı߳�������������ε��ܳ���4*�߳�������������߳�*�߳�����
	int   r=5;
	int  l=r*4;
	int  s=r*r;
*/
class VarTest{
	public static void main(String[] args){
		int varA = 3;
		int varB = 4;
		int varC = 5;
		System.out.println("varSum:"+varA+varB+varC);
		
		String name = "С��";
		char sex = '��';
		int age = 18;
		double hight = 185.6;
		System.out.println("name:"+name+" sex:"+sex+" age:"+age+" hight"+hight);
		
		double javaScore = 100;
		double sqlScore = 90;
		double htmlScore = 99;
		double cha = javaScore - sqlScore;
		double averScore = (javaScore+sqlScore+htmlScore)/3;  
		System.out.println("Java�κ�SQL�εķ���֮��Ϊ��"+cha);
		System.out.println("3�ſε�ƽ����"+averScore);
		
		int r = 5;
		int l = r*4;
		int s = r*r;
		System.out.println("�������ε��ܳ�Ϊ��"+l+"�������Ϊ��"+s);
	}
}