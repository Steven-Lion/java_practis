package java_Thread;
/*
 * ����
 * ������һ����⡣
 * �����������ֱ��300$��ÿ�δ�100����3��.
 * */

class Bank{
	Object obj = new Object();
	private int sum ;//����ܶ�.
//	�û����뷽��.
//	1��һ�ַ�ʽ:ͬ��������synchronized���κ���.
//	2�ڶ��ַ�ʽ:ͬ��ʹ�ô����װ�ķ�ʽ��
//		synchronized(һ������){Ҫͬ���Ĵ����}
	
	public synchronized void add(int n){
		sum += n;
	
		System.out.println(Thread.currentThread().getName()+"sum = "+ sum);
	}
	
}

class demo implements Runnable{//ʵ��Runnable�ӿ�
	
	private	Bank b = new Bank();
	@Override
	public void run() {
		
			
			for(int i = 0;i < 3;i++){
			b.add(100);
			
		}
			
		
		
		
	}
	
}

public class Thread_bank {

	public static void main(String[] args) {
			
		demo e = new demo();//����ʵ��.
			
		//�����߳�
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		
		//�����߳�.
		t1.start();
		t2.start();
	}

}
