
public class Test {
	public static void main(String[] args){
//		A a = new A();	
//		System.out.println(a.getNumber(0));//��14��
		}
}
interface A{
	public int getNumber(int a);
}
abstract class B implements  A{//A1
	public int getNumber(int a,char c){ //��7��
		return a+2;
}

}