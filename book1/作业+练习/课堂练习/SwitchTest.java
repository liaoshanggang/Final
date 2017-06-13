/*
有2~10输出对应数字
1，11~13输出对应A,J,Q，K
*/
import java.util.Random;
class SwitchTest{
	public static void main(String[] args){
		Random rd = new Random();
		int num;
		while(true){
			num = rd.nextInt(14);
			if(num==0){
				break;
			}
			switch(num){
			case 1:
				System.out.println("A");
				break;
			case 11:
				System.out.println("J");
				break;
			case 12:
				System.out.println("Q");
				break;	
			case 13:
				System.out.println("K");
				break;
			default:
				System.out.println(num);
			}
		}
		
	// while(true){
		// int num = rd.nextInt(14);
		// switch(num){
			// case 1:
				// System.out.println("A");
			// break;
			// case 2:
				// System.out.println("2");
			// break;
			// case 3:
				// System.out.println("3");
			// break;
			// case 4:
				// System.out.println("4");
			// break;
			// case 5:
				// System.out.println("5");
			// break;
			// case 6:
				// System.out.println("6");
			// break;
			// case 7:
				// System.out.println("7");
			// break;
			// case 8:
				// System.out.println("8");
			// break;
			// case 9:
				// System.out.println("9");
			// break;
			// case 10:
				// System.out.println("10");
			// break;
			// case 11:
				// System.out.println("J");
			// break;
			// case 12:
				// System.out.println("K");
			// break;
			// case 13:
				// System.out.println("L");
			// break;
			// default:
				// System.out.println("over!");
			// break;
		// }
		// if(num==0){
				// break;
		// }
	// }
	}
}