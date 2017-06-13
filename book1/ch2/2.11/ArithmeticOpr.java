class ArithmeticOpr{
	public static void main(String[] args){
		int i1 = 10,i2 = 20;
		//i++
		int i = (i2++);
		System.out.print("i="+i);
		System.out.println(" i2="+i2);
		//++i
		i = (++i2);
		System.out.print("i="+i);
		System.out.println(" i2="+i2);
		//--i
		i = (--i1);
		System.out.print("i="+i);
		System.out.println("i1="+i1);
		//i--
		i = (i1--);
		System.out.print("i="+i);
		System.out.println("i1="+i1);
		//%
		System.out.println("10%3="+20%3);
		System.out.println("20%3="+10%3);
		
		//?:
		int rst = (20%3)>1?-10:10;
		System.out.println("(20%3)>1?-10:10="+rst);
	}
}