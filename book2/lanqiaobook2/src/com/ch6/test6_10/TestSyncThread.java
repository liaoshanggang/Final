package com.ch6.test6_10;

public class TestSyncThread {
	public static void main(String[] args) {
		//����һ���߳�֮�侺��ʹ�õĶ���
//		Object obj =  new Object();
		for (int i = 0; i < 5; i++) {
//			new Thread(new SyncThread(i)).start();
//			new Thread(new SyncThread(i,obj)).start();
			new Thread(new SyncThread(i)).start();
		}
	}	
}

class SyncThread implements Runnable {
	
	private int id;
//	private Object lock;
	//���߳����ڲ�����һ����̬������Դlock
	private static Object lock = new Object();
	
	public SyncThread(int id) {
		// TODO �Զ����ɵĹ��캯�����
		this.id = id;
	}
	public SyncThread(int id,Object obj) {
		// TODO �Զ����ɵĹ��캯�����
		this(id);
		this.lock = obj;
	}
	
//	@Override
//	public void run() {
//		// TODO �Զ����ɵķ������
//		synchronized (lock) {
//			for (int i = 0; i < 10; i++) {
//			System.out.println("�߳�ID��Ϊ��" + this.id + "���������" + i);
//			}
//		}
//	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		doTask(id);
	}
	
	//ͨ����ľ�̬����ʵ�ֻ������
	private static synchronized void doTask(int id) {
		for (int i = 0; i < 10; i++) {
			System.out.println("�߳�ID��Ϊ��"+id+"���������"+i);
		}
	}
	
}