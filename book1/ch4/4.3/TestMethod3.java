import java.util.Scanner;
class TestMethod3{
	static int userSel = -1;
	public static void main(String[] args){
		while(true){
			userSel = showMenu();
			switch(userSel){
				case 1:
					inputData();break;
				case 2:
					outputData();break;
				case 3:
					System.out.println("��������!");break;
				default:
					System.out.println("�������ݲ���ȷ!");break;
			}
			if(userSel==3){
				break;
			}
		}
	}
	//��ʾ���������棬�����û�����Ĺ��ܲ˵���
	public static int showMenu(){
		System.out.println("1.��������");
		System.out.println("2.�������");
		System.out.println("3.�˳�����");
		Scanner input = new Scanner(System.in);
		System.out.print("��ѡ��������루ֻ������1��2��3��:");
		userSel = input.nextInt();
		return userSel;
	}
	//����������ݵĹ���
	public static void inputData(){
		System.out.println("ִ��1.��������ģ��");
		System.out.println("******************");
		System.out.println("******************");
	}
	//���������ݵĹ���
	public static void outputData(){
		System.out.println("ִ��2.��������ģ��");
		System.out.println("******************");
		System.out.println("******************");
	}
}