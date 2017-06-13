/**1、定义3个整形变量，分别是3，4，5，计算他们的和？


2.保存你的姓名，性别，年龄和身高，然后按照下列的格式输出
   小李
   男
   18
   185.6

3、学员王浩3门课程成绩如下：java：100;  sql=90;  html=99，编写程序实现
   （1）Java课和SQL课的分数之差
   （2）3门课的平均分

4、定义一个变量保存正方形的边长，计算此正方形的周长（4*边长），及面积（边长*边长）。
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
		
		String name = "小李";
		char sex = '男';
		int age = 18;
		double hight = 185.6;
		System.out.println("name:"+name+" sex:"+sex+" age:"+age+" hight"+hight);
		
		double javaScore = 100;
		double sqlScore = 90;
		double htmlScore = 99;
		double cha = javaScore - sqlScore;
		double averScore = (javaScore+sqlScore+htmlScore)/3;  
		System.out.println("Java课和SQL课的分数之差为："+cha);
		System.out.println("3门课的平均分"+averScore);
		
		int r = 5;
		int l = r*4;
		int s = r*r;
		System.out.println("此正方形的周长为："+l+"，及面积为："+s);
	}
}