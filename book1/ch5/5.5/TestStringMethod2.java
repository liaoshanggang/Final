public class TestStringMethod2{
	public static void main(String[] args){
		String fileName = "212345678¼Ò¾Ó·þ RESUME.docx";
		System.out.println(fileName.startsWith("2014"));
		System.out.println(fileName.endsWith("docx"));
		System.out.println(fileName.endsWith("x"));
		System.out.println(fileName.toLowerCase());
		System.out.println(fileName.toUpperCase());
		System.out.println(fileName.substring(9));
		System.out.println(fileName.substring(9,11));
			
		String fileName2 = " 2015sfsfsfResume  .docx";
		System.out.println(fileName2.trim());
		
		String result = String.valueOf(1000);
		String result1 = String.valueOf(100.5555);
		
		System.out.println(result);
		System.out.println(result1);
		
	}
}