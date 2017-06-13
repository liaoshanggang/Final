// import java.util.Scanner;
// class TestIf1{
	// /*
		// 1、输入一个int型的数据，判断这个数是
	   // 否能被2整除，如果能被2整除，
	   // 那么输出“这个数是偶数”，
	   // 否则输出“这个数是奇数”
	// */
	// public static void main(String[] args){
		// Scanner in = new Scanner(System.in);
		// System.out.print("请您输入一个int型的数据：");
		// int intDig = in.nextInt();
		// if(intDig%2==0){
			// System.out.println("这个数是偶数");
		// }else{
			// System.out.println("这个数是奇数");
		// }
	// }
// }
// import java.util.Scanner;
// class TestIf2{
	// /*
		// 2、输入三个double型的数据，
		// 放入到a,b,c三个变量中去，
		// 使用条件结构与交换逻辑将
		// 这三个变量中的值从小到大排列
	// */
	// public static void main(String[] args){
		// Scanner in = new Scanner(System.in);
		// System.out.print("请您输入第一个double型的数据：");
		// double var1 = in.nextDouble();
		// System.out.print("请您输入第一个double型的数据：");
		// double var2 = in.nextDouble();
		// System.out.print("请您输入第一个double型的数据：");
		// double var3 = in.nextDouble();
		// double temp;
		// if(var1<var2){
			// temp = var1;
			// var1 = var2;
			// var2 = temp;				
		// }
		// if(var1<var3){
			// temp = var1;
			// var1 = var3;
			// var3 = temp;
		// }
		// if(var2<var3){
			// temp = var2;
			// var2 = var3;
			// var3 = temp;
		// }
		// System.out.println("三个变量中的值从小到大排列:"+var3+" "+var2+" "+var1);
	// }
// }

// import java.util.Scanner;
// class TestIf3{
	// /*
	// 3、到商场去购买商品，首先购买了一台电视机，请输入电视机的价格。然后又购买了一个冰箱，
	// 请输入冰箱的价格。最后到前台交钱。如果总价格小于100元就不打折，如果总价格大于等于100--1000元就打9折，
	// 如果总价格大于等于1000元就打8折,如果总价格大于5000元就打7折。输出最后需要多少元。(多重if)
	// */
	// public static void main(String[] args){
		// Scanner in = new Scanner(System.in);
		// System.out.print("请输入你购买了的电视机的价格：");
		// double tvPrice = in.nextDouble();
		// System.out.print("请输入你购买了的冰箱的价格：");
		// double frgPrice = in.nextDouble();
		// double sumPrice = tvPrice + frgPrice;
		// if(sumPrice<100){
			// System.out.println("最后需要"+sumPrice+"元");
		// }else if(sumPrice>=100&&sumPrice<1000){
			// sumPrice = sumPrice*0.9;
			// System.out.println("最后需要"+sumPrice+"元");
		// }else if(sumPrice>=1000&&sumPrice<5000){
			// sumPrice = sumPrice*0.8;
			// System.out.println("最后需要"+sumPrice+"元");
		// }else if(sumPrice>=5000){
			// sumPrice = sumPrice*0.7;
			// System.out.println("最后需要"+sumPrice+"元");
		// }
	// }
// }
// import java.util.Scanner;
// class TestIf4{
	// /*
	// 4、输入一个整数代表年，如果这个整数能被4整除但不能被100整除，或者能被400整数，就输出这一年是润年，
	// 否则就输出这一年是平年。(普通if)
	// */
	// public static void main(String[] args){
		// Scanner in = new Scanner(System.in);
		// System.out.print("请输入您要判断的年份：");
		// int year = in.nextInt();
		// if(year%4==0&&year%100!=0||year%400==0){
			// System.out.println(year+"年是润年");
		// }else{
			// System.out.println(year+"年是平年");
		// }
	// }
// }

import java.util.Scanner;
class TestIf5{
	/*	
	5、学校组织田径运动，分别男子组800米，女子组800米，男子组1000米，女子组1000米
	请根据键盘输入来确定报名者参加的项目(嵌套if).
	*/
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		String name;
		char sex;
		int sport;
		System.out.print("请输入您的姓名：");
		name = in.next();
		System.out.print("请输入你的姓别(只能男或女)");
		sex = in.next().charAt(0);
		System.out.print("请输入你要参加的项目（1000 800）");
		sport = in.nextInt();
		if(sex == '男'){
			if(sport == 1000){
				System.out.println("你要参加的项目为男子组1000米");
			}else{
				System.out.println("你要参加的项目为男子组800米");
			}
		}else if(sex == '女'){
			if(sport == 1000){
				System.out.println("你要参加的项目为女子组1000米");
			}else{
				System.out.println("你要参加的项目为女子组800米");
			}
		}
	}
}