package com.ch2.test2_3_3;

public class TestSeqStack {
	public static void main(String[] args) {
		SeqStack seqStack = new SeqStack();
		int test[] = {23,34,2,12,19,43};
		
		try {
			//���ν��ⳤ��Ϊ6���������������ת��ΪInteger������ջ
			for (int i = 0; i < test.length; i++) {
				seqStack.push(test[i]);
			}
			
			//��ȡջ��Ԫ��
			System.out.println("��ǰջ��Ԫ��Ϊ��"+seqStack.getTop());
			System.out.println("Ԫ�س�ջ����Ϊ��");
			while(seqStack.isEmpty()){
				System.out.println(seqStack.pop());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
