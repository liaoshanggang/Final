/*
	����5λͬѧ�����֣������Ƿ�����������ˣ����������У�û������޴���
*/
class TestArray{
	public static void main(String[] args){
		//��������
		String[] name;
		//��������
		name = new String[5];
		//Ϊname���鸳ֵ
		name[0] = "lisi";
		name[1] = "����";
		name[2] = "����";
		name[3] = "niubi";
		name[4] = "С��";
		//�������ж����
		boolean flag = false;
		for(int i=0;i<name.length;i++){
			if(name[i].equals("����")){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("�鵽��");
		}else{
			System.out.println("�޴���");
		}
	}
}