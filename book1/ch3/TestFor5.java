/**
�������1��100֮�������
˼·����һ�������γ�����������
*/
class TestFor5{
	public static void main(String[] args){
		outer:for(int num=1;num<=100;num++){
			for(int j=2;j<=Math.sqrt(num);j++)
			if(num%j==0){
				continue outer;
			}
		System.out.println("1��100֮���������:"+num);
		}
	}
}