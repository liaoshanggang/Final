package com.ch2.test2_3_4;

public class SeqQueue implements Queue{
	final int defaultsize = 10;
	int front;//��ͷ
	int rear;//��β
	int maxsize;//���г���
	int cursize;//��ǰԪ�ظ���
	Object[] queue;
	
	public SeqQueue() {
		// TODO �Զ����ɵĹ��캯�����
		initiate(defaultsize);
	}
	
	public SeqQueue(int sz){
		initiate(sz);
	}
	private void initiate(int sz) {
		// TODO �Զ����ɵķ������
		maxsize = sz;
		front = 0;
		rear = 0;
		cursize = rear-front;
		queue = new Object[sz];
	}

	@Override
	public void enQueue(Object obj) throws Exception {
		// TODO �Զ����ɵķ������
		//1���ж϶����Ƿ�����
		if((cursize)==maxsize){
			throw new Exception("�����������޷���ӣ�");
		}
		//2�����
		for (int i = cursize; i>rear; i--) {
			queue[i] = queue[i-1];
		}
		queue[rear] = obj;
		front = cursize;
		cursize++;
	}

	@Override
	public Object deQueue() throws Exception {
		// TODO �Զ����ɵķ������
		//1���ж϶����Ƿ�Ϊ��
		if(cursize==0){
			throw new Exception("�����ѿգ��޷�ɾ����");
		}
		//2��ɾ��Ԫ��
		Object obj = queue[front];
		queue[front] = null;
		cursize--;
		front--;
		return obj;
	}

	@Override
	public Object getFront() throws Exception {
		// TODO �Զ����ɵķ������
		//1���ж��Ƿ�Ϊ��
		if(cursize==0){
			throw new Exception("�����ѿգ��޷���ȡͷԪ�أ�");
		}
		return queue[front];
	}

	@Override
	public boolean isEmpty() {
		// TODO �Զ����ɵķ������
		return cursize>=0;
	}
	public void show(){
		for (int i = 0; i < queue.length; i++) {
			System.out.print(queue[i]+"  "); 
		}
	}
	public static void main(String[] args) {
		SeqQueue seqQueue = new SeqQueue();
		try {
			for (int j = 0; j < 10; j++) {
				seqQueue.enQueue("string"+j);
				seqQueue.show();
				System.out.println();
			}	
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		try {
			
			System.out.println("ɾ����Ԫ��Ϊ��"+seqQueue.deQueue());
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		seqQueue.show();
		System.out.println();
		try {
			for (int j = 0; j < 1; j++) {
				seqQueue.enQueue("string"+j);
				seqQueue.show();
				System.out.println();
			}	
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		try {
			while(seqQueue.isEmpty()){
				seqQueue.deQueue();
				seqQueue.show();
				System.out.println();
				System.out.println("ͷԪ��Ϊ��"+seqQueue.getFront());
				seqQueue.show();
				System.out.println();
			}	
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
