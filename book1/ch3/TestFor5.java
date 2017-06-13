/**
需求：输出1至100之间的质数
思路：让一个数依次除以其他各数
*/
class TestFor5{
	public static void main(String[] args){
		outer:for(int num=1;num<=100;num++){
			for(int j=2;j<=Math.sqrt(num);j++)
			if(num%j==0){
				continue outer;
			}
		System.out.println("1至100之间的质数有:"+num);
		}
	}
}