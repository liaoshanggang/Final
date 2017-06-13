/* 1、定义一个二维数组，用来记录3个学生的java,c#,sql三门功课的成绩，二维数组的一行记录一个人的成绩，要求循环输入，最后输出格式如下：
			java	c#	sql
第1名学生	89		79	98
第2名学生	99		80	100
第3名学生	79		99	87

2、定义一个二维数组，int[3][4]，要求是循环输入12个整数，放入到数组中，然后使用嵌套循环找到这个数组中的最大值。

3、杨辉三角

4、一个推箱游戏（选做）。 */
import java.util.Scanner;
public class TestArray2{
	public static void main(String[] args){
		int[][] score = new int[3][3];
		String[] course ={"java","c#","sql"};
		Scanner input = new Scanner(System.in);
		for(int i=0;i<score.length;i++){
			for(int j=0;j<course.length;j++){
				System.out.println("请输入第"+(i+1)+"个学生的成绩:"+java[j]+":");
				score[i][j] = input.nextInt();
			}
		}
		
		
	}
}