import java.util.Scanner;
class TestForFor3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		int k = 1;
		int h = 1;
		String answer ="";
		System.out.println("-------��������Ϸ---------");
		while(true){
				switch(h){
				case 1:
					if(flag==false){
					System.out.println("��һ��");
					System.out.println("һ��һ����һ��");
					}
					break;
				case 2:
					if(flag==false){
					System.out.println("�ڶ���");
					System.out.println("һ��ʮ���㣬������ε㣬��һ����");
					}
					break;
				case 3:
					if(flag==false){
					System.out.println("������");
					System.out.println("һ�ټ�һ����һ����");
					}
					break;
				case 4:
					if(flag==false){
					System.out.println("���Ĺ�");
					System.out.println("һ����ݣ���һ����");
					}
					break;
				case 5:
					if(flag==false){
					System.out.println("�����");
					System.out.println("һ�����ģ���һ����");
					}
					break;
				case 6:
					if(flag==false){
					System.out.println("������");
					System.out.println("�ŵ㣬��һ����");
					}
					break;
				case 7:
					if(flag==false){
					System.out.println("���߹�");
					System.out.println("�˲�����λ����һ����");
					}
					break;
				case 8:
					if(flag==false){
					System.out.println("�ڰ˹�");
					System.out.println("ʮ����磬��һ����");
					}
					break;
				case 9:
					if(flag==false){
					System.out.println("�ھŹ�");
					System.out.println("���ײ��꣬��һ����");
					}
					break;
				case 10:
					if(flag==false){
					System.out.println("���չ�--��ʮ��");
					System.out.println("�������ں�ɽ�ϣ���һ����");
					}
					break;
				default:
					break;
				}
				answer = input.next();
				if(answer.equals("��")){
					//��֤��Ψһ��
					if(k==1){
						k++;
						h = k;
						System.out.println("���سɹ���������һ��");
					}
					System.out.println(k);
					
					continue;
				}else if(answer.equals("֭")){
					if(k==2){
						k++;
						h = k;
						System.out.println("���سɹ���������һ��");
					}
					
					continue;
				}else if(answer.equals("��")){
					if(k==3){
						k++;
						h = k;
						System.out.println("���سɹ���������һ��");
					}
					
					continue;
				}else if(answer.equals("��")){
					if(k==4){
						k++;
						h = k;
						System.out.println("���سɹ���������һ��");
					}
					
					continue;
				}else if(answer.equals("��")){
					if(k==5){
						k++;
						h = k;
						System.out.println("���سɹ���������һ��");
					}
					
					continue;
				}else if(answer.equals("��")){
					if(k==6){
						k++;
						h = k;
						System.out.println("���سɹ���������һ��");
					}
					
					continue;
				}else if(answer.equals("��")){
					if(k==7){
						k++;
						h = k;
						System.out.println("���سɹ���������һ��");
					}
					
					continue;
				}else if(answer.equals("��")){
					if(k==8){
						k++;
						h = k;
						System.out.println("���سɹ���������һ��");
					}
					
					continue;
				}else if(answer.equals("��")){
					if(k==9){
						k++;
						h = k;
						System.out.println("���سɹ���������һ��");
					}
					
					continue;
				}else if(answer.equals("ѩ")){
					if(k==10){
						k++;
						h = k;
						System.out.println("��������");
						break;
					}
					continue;
				}else{
					flag = false;
					System.out.println("����ʧ�ܣ������²²⣬��Ȼ��ᱻ���������������");
				}
				// if(k==11){
					// break;
				// }
		}
			
	}
}