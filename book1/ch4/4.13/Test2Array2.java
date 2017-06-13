/*
需求：使用二维数组打印出杨辉三角，
1
1	1
1	2	1
1	3	3	1
1	4	6	4	1
1	5	10	10	5	1
*/
class Test2Array2{
	public static void main(String[] args){
		int a[][] = new int[20][20];
		a[0][0] = 1;
		for(int i=1;i<9;i++){
			a[i][0] = 1;
			a[i][i] = 1;
			for(int j=1;j<=i;j++){
				a[i][j] = a[i-1][j] + a[i-1][j-1];
			}
			
		}
		for(int i=0;i<9;i++){
			for(int j=0;j<=i;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}