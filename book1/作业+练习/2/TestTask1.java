/*
	1、定义一个变量记录天数=10，计算10天共有多少小时。多少分钟。
	天	小时	分钟
	10	****	****
*/
class TestTask1
{
	public static void main(String[] args){
		int day = 10;
		int hour = day*24;
		int minute = hour*60;
		System.out.println(day+"天共有"+hour+"小时，"+minute+"分钟。");
	}
}