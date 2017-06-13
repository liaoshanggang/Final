package com.ch2.test2_3_3;

public class TestSeqStack {
	public static void main(String[] args) {
		SeqStack seqStack = new SeqStack();
		int test[] = {23,34,2,12,19,43};
		
		try {
			//依次将这长度为6的整形数组里的数转换为Integer类型入栈
			for (int i = 0; i < test.length; i++) {
				seqStack.push(test[i]);
			}
			
			//获取栈顶元素
			System.out.println("当前栈顶元素为："+seqStack.getTop());
			System.out.println("元素出栈序列为：");
			while(seqStack.isEmpty()){
				System.out.println(seqStack.pop());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
