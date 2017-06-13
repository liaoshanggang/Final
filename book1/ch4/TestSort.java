/*
–Ë«Û£∫√∞≈›≈≈–Ú∫Õ≤Â»Î≈≈–Ú
*/
import java.util.Scanner;
class TestSort{
	public static void main(String[] args){
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("please input ten data:");
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		bubbleSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void bubbleSort(int[] a){
		int temp;
		for(int i=0;i<=a.length;i++){
			for(int j=0;j<=a.length-i-1;j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
	}
	public static void insertSort(){
		
	}
}