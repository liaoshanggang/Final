/*
需求：某学习小组有4个学生，每个学生有3门课的考试成绩，如下
科目\姓名	王云	刘静涛	南天华	雷静
Java基础	77		65		91		84
前端技术	56		71		88		79
后端技术	80		81		85		66
求各科目的平均成绩和总平均成绩。
*/
import java.util.Scanner;
class Test2Array{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] course = {"Java基础","前端技术","后端技术"};
		String[] stuName = {"王云","刘静涛","南天华","雷静"};
		double[][] score = new double[3][4];
		double[] singleGrade = new double[3];
		double sumGrade = 0;
		System.out.println("请录入学生的考试成绩信息：");
		for(int i=0;i<course.length;i++){
			for(int j=0;j<stuName.length;j++){
				System.out.print("请输入科目："+course[i]+"学生"+stuName[j]+"的成绩为：");
				score[i][j] = input.nextDouble();
				singleGrade[i] = singleGrade[i] +score[i][j];
			}
			 sumGrade= sumGrade + singleGrade[i];
		}
		for(int i=0;i<course.length;i++){
			System.out.println("科目："+course[i]+"的平均成绩："+singleGrade[i]/4);
		}
		System.out.println("总平均成绩为："+sumGrade/12);
		
	}
	
}