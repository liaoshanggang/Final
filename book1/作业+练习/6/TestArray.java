/* 1������һ���ַ��������飬�ռ�Ϊ5����
	����һ���ռ��ֵ����Ϊ�����������ڶ����ռ��ֵΪ�����ġ���
	�������ռ��ֵΪ�������������ĸ��ռ��ֵΪ�����ӡ���������ռ��ֵΪ��С�족��
	Ȼ����������пռ��е�ֵ��
*/
import java.util.Random;
import java.util.Scanner;
class TestArray1{
	public static void main(String[] args){
		String[] names = {"����","����","����","����","С��"};
		for(int i=0;i<names.length;i++){
			System.out.println("��"+(i+1)+"���ռ��ֵΪ��"+names[i]);
		}
	}
}
/*2������һ���ַ��������飬�ռ�Ϊ5����ʹ��ѭ���������ѧ������������ʹ��ѭ����������ѧ��������.
*/
// import java.util.Scanner;
class TestArray2{
	public static void main(String[] args){
		String[] names = new String[5];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<names.length;i++){
			System.out.print("�������"+(i+1)+"��ѧ����������");
			names[i] = input.next();
		}
		System.out.println("��Щѧ��������Ϊ��");
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
	}
}
/* 3������һ��int�͵����飬ѭ������8��ѧ���ĳɼ���������8��ѧ�����ּܷ�ƽ���֡� */

class TestArray3{
	public static void main(String[] args){
		int[] scores = new int[8];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<scores.length;i++){
			System.out.print("�������"+(i+1)+"��ѧ���ĳɼ���");
			scores[i] = input.nextInt();
		}
		int sum = 0;
		int average = 0;
		int i=0;
		for(;i<scores.length;i++){
			sum = sum + scores[i];
		}
		average = sum/i;
		System.out.print("��8��ѧ�����ܷ�Ϊ��"+sum);
		System.out.println("ƽ����Ϊ��"+average);
	}
}

/* 4������һ��int�͵����飬ѭ���������13��1��13֮����������뵽��������ȥ��
��ѭ������� */
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

/* 5������һ��char�͵����飬�ڴ�����ĵ�Ԫ���з���"�Ұ���"�����ַ���
Ȼ��ʹ��ѭ�����������������"�㰮��"�� */
class TestArray5{
	public static void main(String[] args){
		char[] chArray = new char[3];
		chArray[0] = '��';
		chArray[1] = '��';
		chArray[2] = '��';
		for(int i=chArray.length-1;i>=0;i--){
			System.out.print(chArray[i]);
		}
	}
}
/* 6������һ��int�͵����飬ѭ���������5��1��13֮������������ѭ�������
Ҫ������������1�����������һ��A��,�����2��ֱ��˵������һ��2
��,ֱ��10������ˣ�����������11������������һ��J��,
����������12�����������һ��Q��������������13�����������һ��K���� */
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
					System.out.println("����һ��A");
					break;
				case 11:
					System.out.println("����һ��J");
					break;
				case 12:
					System.out.println("����һ��Q");
					break;
				case 13:
					System.out.println("����һ��K");
					break;
				default:
					System.out.println("����һ��"+randoms[i]);
			}
		}
	}
}
/* 7��ѭ������5��ѧ���ĳɼ����뵽һ�����ε������У�Ȼ�������5��ѧ����ƽ���֣�
	��������ʽ���£�
	ѧ��1	ѧ��2	ѧ��3	ѧ��4	ѧ��5
	80	90	95	82	96
	ƽ�����ǣ����� */
import java.util.Scanner;
class TestArray7{
	public static void main(String[] args){
		int[] scores = new int[5];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<scores.length;i++){
			System.out.print("�������"+(i+1)+"��ѧ���ĳɼ���");
			scores[i] = input.nextInt();
		}
		for(int i=0;i<scores.length;i++){
			System.out.print("ѧ��"+(i+1)+"\t");
		}
		System.out.println();
		int sum = 0;
		int i=0;
		for(;i<scores.length;i++){
			System.out.print(scores[i]+"\t");
			sum += scores[i];
		}
		System.out.println("\nƽ�����ǣ�"+sum/i);
		
	}
}
	
/*8.�����ֵ����Сֵ  */
import java.util.Scanner;
class TestArray8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������Ƚϼ������֣�");
		int num = input.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"�����ֵ�ֵ��");
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
		System.out.println("��Щ���е����ֵΪ��"+arr[num-1]+"\t��СֵΪ��"+arr[0]);
	}
}