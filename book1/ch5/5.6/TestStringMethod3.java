import java.util.Scanner;
public class TestStringMethod3{
	public static void main(String[] args){
		String result = String.valueOf(100);
		Scanner input = new Scanner(System.in);
		System.out.println("��������ȥ��һ���нˮ�ܺͣ�");
		int lastSalary = input.nextInt();
		String strResult = String.valueOf(lastSalary);
		System.out.println("��ȥ��һ���нˮ���ܺ��ǣ�"+strResult.length()+"λ����");
		String date = " ,May,F,1976";
		String[] splitStr = date.split(",");
		System.out.println("Mary,F,1976ʹ�ã��ָ���Ľ����");
		for(int i=0;i<splitStr.length;i++){
			System.out.println("==="+splitStr[i]+"===");
		}
	}
}