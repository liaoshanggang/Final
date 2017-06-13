import java.util.Scanner;
class TestForFor3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		int k = 1;
		int h = 1;
		String answer ="";
		System.out.println("-------猜字谜游戏---------");
		while(true){
				switch(h){
				case 1:
					if(flag==false){
					System.out.println("第一关");
					System.out.println("一加一，猜一字");
					}
					break;
				case 2:
					if(flag==false){
					System.out.println("第二关");
					System.out.println("一字十三点，难在如何点，猜一个字");
					}
					break;
				case 3:
					if(flag==false){
					System.out.println("第三关");
					System.out.println("一百减一，猜一个字");
					}
					break;
				case 4:
					if(flag==false){
					System.out.println("第四关");
					System.out.println("一个礼拜，猜一个字");
					}
					break;
				case 5:
					if(flag==false){
					System.out.println("第五关");
					System.out.println("一箭穿心，猜一个字");
					}
					break;
				case 6:
					if(flag==false){
					System.out.println("第六关");
					System.out.println("九点，猜一个字");
					}
					break;
				case 7:
					if(flag==false){
					System.out.println("第七关");
					System.out.println("人不在其位，猜一个字");
					}
					break;
				case 8:
					if(flag==false){
					System.out.println("第八关");
					System.out.println("十个哥哥，猜一个字");
					}
					break;
				case 9:
					if(flag==false){
					System.out.println("第九关");
					System.out.println("久雷不雨，猜一个字");
					}
					break;
				case 10:
					if(flag==false){
					System.out.println("最终关--第十关");
					System.out.println("大雨落在横山上，猜一个字");
					}
					break;
				default:
					break;
				}
				answer = input.next();
				if(answer.equals("王")){
					//保证答案唯一性
					if(k==1){
						k++;
						h = k;
						System.out.println("闯关成功，进入下一关");
					}
					System.out.println(k);
					
					continue;
				}else if(answer.equals("汁")){
					if(k==2){
						k++;
						h = k;
						System.out.println("闯关成功，进入下一关");
					}
					
					continue;
				}else if(answer.equals("白")){
					if(k==3){
						k++;
						h = k;
						System.out.println("闯关成功，进入下一关");
					}
					
					continue;
				}else if(answer.equals("七")){
					if(k==4){
						k++;
						h = k;
						System.out.println("闯关成功，进入下一关");
					}
					
					continue;
				}else if(answer.equals("必")){
					if(k==5){
						k++;
						h = k;
						System.out.println("闯关成功，进入下一关");
					}
					
					continue;
				}else if(answer.equals("丸")){
					if(k==6){
						k++;
						h = k;
						System.out.println("闯关成功，进入下一关");
					}
					
					continue;
				}else if(answer.equals("立")){
					if(k==7){
						k++;
						h = k;
						System.out.println("闯关成功，进入下一关");
					}
					
					continue;
				}else if(answer.equals("克")){
					if(k==8){
						k++;
						h = k;
						System.out.println("闯关成功，进入下一关");
					}
					
					continue;
				}else if(answer.equals("田")){
					if(k==9){
						k++;
						h = k;
						System.out.println("闯关成功，进入下一关");
					}
					
					continue;
				}else if(answer.equals("雪")){
					if(k==10){
						k++;
						h = k;
						System.out.println("完美闯关");
						break;
					}
					continue;
				}else{
					flag = false;
					System.out.println("闯关失败，请重新猜测，不然你会被困在这里哈哈哈哈");
				}
				// if(k==11){
					// break;
				// }
		}
			
	}
}