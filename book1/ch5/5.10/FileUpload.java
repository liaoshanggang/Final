/*
����ύ���ĵĹ���
��1����Ҫ��������ļ������ļ��������ԡ�docx��β��
��2����Ҫ���������ķ��������䣬������뺬�С�@���͡�.�����ҡ�.���ڡ�@��֮��
*/
import java.util.Scanner;
class FileUpload{
	public static void main(String[] args){
		boolean fileCorret = false;
		boolean emailCorret = false;
		Scanner input = new Scanner(System.in);
		System.out.println("�밴������Ҫ���ύ����");
		System.out.println("�����������ļ�����������.docx��β����");
		String fileName = input.next();
		System.out.println("��������Ľ������ķ��������䣺");
		String email = input.next();
		
		//��������ļ���
		if(fileName.endsWith(".docx")){
			fileCorret = true;
		}else{
			System.out.println("�ļ�����Ч��");
		}
		
		//��������ʽ
		if(email.indexOf("@")!=-1&&email.indexOf(".")>email.indexOf("@")){
			emailCorret = true;
		}else{
			System.out.println("������Ч��");
		}
		//������
		if(fileCorret&&emailCorret){
			System.out.println("�����ύ�ɹ���");
		}else{
			System.out.println("�����ύʧ��!");
		}
	}
}