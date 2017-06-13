/*
	保存5位同学的名字，查找是否有张三这个人，如果有输出有，没有输出无此人
*/
class TestArray{
	public static void main(String[] args){
		//定义数组
		String[] name;
		//创建数组
		name = new String[5];
		//为name数组赋值
		name[0] = "lisi";
		name[1] = "万物";
		name[2] = "张三";
		name[3] = "niubi";
		name[4] = "小三";
		//遍历并判断输出
		boolean flag = false;
		for(int i=0;i<name.length;i++){
			if(name[i].equals("张三")){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("查到了");
		}else{
			System.out.println("无此人");
		}
	}
}