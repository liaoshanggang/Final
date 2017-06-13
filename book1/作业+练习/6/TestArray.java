/* 1、声明一个字符串的数组，空间为5个。
	将第一个空间的值设置为“张三”，第二个空间的值为“李四”，
	第三个空间的值为“王二”，第四个空间的值为“麻子”，第五个空间的值为“小红”。
	然后再输出所有空间中的值。
*/
import java.util.Random;
import java.util.Scanner;
class TestArray1{
	public static void main(String[] args){
		String[] names = {"张三","李四","王二","麻子","小红"};
		for(int i=0;i<names.length;i++){
			System.out.println("第"+(i+1)+"个空间的值为："+names[i]);
		}
	}
}
/*2、声明一个字符串的数组，空间为5个。使用循环接收五个学生的姓名。再使用循环输出这五个学生的姓名.
*/
// import java.util.Scanner;
class TestArray2{
	public static void main(String[] args){
		String[] names = new String[5];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<names.length;i++){
			System.out.print("请输入第"+(i+1)+"个学生的姓名：");
			names[i] = input.next();
		}
		System.out.println("这些学生的名字为：");
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
	}
}
/* 3、声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分。 */

class TestArray3{
	public static void main(String[] args){
		int[] scores = new int[8];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<scores.length;i++){
			System.out.print("请输入第"+(i+1)+"个学生的成绩：");
			scores[i] = input.nextInt();
		}
		int sum = 0;
		int average = 0;
		int i=0;
		for(;i<scores.length;i++){
			sum = sum + scores[i];
		}
		average = sum/i;
		System.out.print("这8个学生的总分为："+sum);
		System.out.println("平均分为："+average);
	}
}

/* 4、声明一个int型的数组，循环随机生成13个1到13之间随机数放入到此数组中去，
再循环输出。 */
import java.util.Random;
class TestArray4{
	public static void main(String[] args){
		Random random = new Random();
		int[] arr = new int[13];
		for(int i=0;i<arr.length;i++){
			arr[i] = random.nextInt(13)+1;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}

/* 5、声明一个char型的数组，在此数组的单元格中放入"我爱你"三个字符，
然后使用循环将它反序输出。如"你爱我"。 */
class TestArray5{
	public static void main(String[] args){
		char[] chArray = new char[3];
		chArray[0] = '我';
		chArray[1] = '爱';
		chArray[2] = '你';
		for(int i=chArray.length-1;i>=0;i--){
			System.out.print(chArray[i]);
		}
	}
}
/* 6、声明一个int型的数组，循环随机生成5个1到13之间的随机数，再循环输出，
要求：如果这个数是1就输出“你有一个A”,如果是2就直接说“你有一个2
”,直到10都是如此，如果这个数是11你就输出“你有一个J”,
如果这个数是12就输出“你有一个Q”，如果这个数是13就输出“你有一个K”。 */
import java.util.Scanner;
class TestArray6{
	public static void main(String[] args){	
		int[] randoms = new int[5];
		Random rd = new Random();
		for(int i=0;i<randoms.length;i++){
			randoms[i] = rd.nextInt(13)+1;
		}
		for(int i=0;i<randoms.length;i++){
			switch(randoms[i]){
				case 1:
					System.out.println("你有一个A");
					break;
				case 11:
					System.out.println("你有一个J");
					break;
				case 12:
					System.out.println("你有一个Q");
					break;
				case 13:
					System.out.println("你有一个K");
					break;
				default:
					System.out.println("你有一个"+randoms[i]);
			}
		}
	}
}
/* 7、循环输入5个学生的成绩放入到一个整形的数组中，然后计算这5个学生的平均分，
	最后输出格式如下：
	学生1	学生2	学生3	学生4	学生5
	80	90	95	82	96
	平均分是：？？ */
import java.util.Scanner;
class TestArray7{
	public static void main(String[] args){
		int[] scores = new int[5];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<scores.length;i++){
			System.out.print("请输入第"+(i+1)+"个学生的成绩：");
			scores[i] = input.nextInt();
		}
		for(int i=0;i<scores.length;i++){
			System.out.print("学生"+(i+1)+"\t");
		}
		System.out.println();
		int sum = 0;
		int i=0;
		for(;i<scores.length;i++){
			System.out.print(scores[i]+"\t");
			sum += scores[i];
		}
		System.out.println("\n平均分是："+sum/i);
		
	}
}
	
/*8.求最大值和最小值  */
import java.util.Scanner;
class TestArray8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入比较几个数字：");
		int num = input.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"个数字的值：");
			arr[i] = input.nextInt();
		}
		int temp;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("这些数中的最大值为："+arr[num-1]+"\t最小值为："+arr[0]);
	}
}