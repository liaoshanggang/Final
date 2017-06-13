/*
完成提交论文的功能
（1）需要检查论文文件名，文件名必须以。docx结尾。
（2）需要检查接收论文反馈的邮箱，邮箱必须含有“@”和“.”，且“.”在“@”之后。
*/
import java.util.Scanner;
class FileUpload{
	public static void main(String[] args){
		boolean fileCorret = false;
		boolean emailCorret = false;
		Scanner input = new Scanner(System.in);
		System.out.println("请按照下面要求提交论文");
		System.out.println("请输入论文文件名（必须以.docx结尾）：");
		String fileName = input.next();
		System.out.println("请输入你的接收论文反馈的邮箱：");
		String email = input.next();
		
		//检查论文文件名
		if(fileName.endsWith(".docx")){
			fileCorret = true;
		}else{
			System.out.println("文件名无效！");
		}
		
		//检查邮箱格式
		if(email.indexOf("@")!=-1&&email.indexOf(".")>email.indexOf("@")){
			emailCorret = true;
		}else{
			System.out.println("邮箱无效！");
		}
		//输出结果
		if(fileCorret&&emailCorret){
			System.out.println("论文提交成功！");
		}else{
			System.out.println("论文提交失败!");
		}
	}
}