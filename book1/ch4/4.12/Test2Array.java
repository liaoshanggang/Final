/*
����ĳѧϰС����4��ѧ����ÿ��ѧ����3�ſεĿ��Գɼ�������
��Ŀ\����	����	������	���컪	�׾�
Java����	77		65		91		84
ǰ�˼���	56		71		88		79
��˼���	80		81		85		66
�����Ŀ��ƽ���ɼ�����ƽ���ɼ���
*/
import java.util.Scanner;
class Test2Array{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] course = {"Java����","ǰ�˼���","��˼���"};
		String[] stuName = {"����","������","���컪","�׾�"};
		double[][] score = new double[3][4];
		double[] singleGrade = new double[3];
		double sumGrade = 0;
		System.out.println("��¼��ѧ���Ŀ��Գɼ���Ϣ��");
		for(int i=0;i<course.length;i++){
			for(int j=0;j<stuName.length;j++){
				System.out.print("�������Ŀ��"+course[i]+"ѧ��"+stuName[j]+"�ĳɼ�Ϊ��");
				score[i][j] = input.nextDouble();
				singleGrade[i] = singleGrade[i] +score[i][j];
			}
			 sumGrade= sumGrade + singleGrade[i];
		}
		for(int i=0;i<course.length;i++){
			System.out.println("��Ŀ��"+course[i]+"��ƽ���ɼ���"+singleGrade[i]/4);
		}
		System.out.println("��ƽ���ɼ�Ϊ��"+sumGrade/12);
		
	}
	
}