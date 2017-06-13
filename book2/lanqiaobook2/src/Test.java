
public class Test {
	public static void main(String[] args){
//		A a = new A();	
//		System.out.println(a.getNumber(0));//第14行
		}
}
interface A{
	public int getNumber(int a);
}
abstract class B implements  A{//A1
	public int getNumber(int a,char c){ //第7行
		return a+2;
}

}