/* 1������һ����ά���飬������¼3��ѧ����java,c#,sql���Ź��εĳɼ�����ά�����һ�м�¼һ���˵ĳɼ���Ҫ��ѭ�����룬��������ʽ���£�
			java	c#	sql
��1��ѧ��	89		79	98
��2��ѧ��	99		80	100
��3��ѧ��	79		99	87

2������һ����ά���飬int[3][4]��Ҫ����ѭ������12�����������뵽�����У�Ȼ��ʹ��Ƕ��ѭ���ҵ���������е����ֵ��

3���������

4��һ��������Ϸ��ѡ������ */
import java.util.Scanner;
public class TestArray2{
	public static void main(String[] args){
		int[][] score = new int[3][3];
		String[] course ={"java","c#","sql"};
		Scanner input = new Scanner(System.in);
		for(int i=0;i<score.length;i++){
			for(int j=0;j<course.length;j++){
				System.out.println("�������"+(i+1)+"��ѧ���ĳɼ�:"+java[j]+":");
				score[i][j] = input.nextInt();
			}
		}
		
		
	}
}