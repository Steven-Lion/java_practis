package java_Thread;
//1.һ����Ʊ����,���߳̿���.
//ͬ��������ʹ�õĶ�����this.
//��̬��ͬ���������Ǹ÷�����������ֽ������ .class
class Demo1 implements Runnable{
	
//	����������Ʊ��.
	private int tickets = 100;
	boolean flag = true;
	Object obj = new Object();
	@Override
	public void run() {
		//��֤һֱ������.
		if(flag){
		while(true){
//			ͬ���������� ͬ����.��������Դ.
//			��ֹ���ֶ��̰߳�ȫ���⣺������0 ,-1,-2��Ʊ.
			synchronized(obj)//obj�൱��һ������Ĭ��Ϊ��,
//			ֻҪ�ж����������Ϊ����������ִ��Ȩ���߳�Ҳ��������
//			���Ǹոս����Ľ��ĳ�ȥ�����ͬ�����������°ѿ��ش�.
			{
			//������ʵ�������������.
			if(tickets>0){
//				try{Thread.sleep(10);}�����쳣��
//				catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+
					"����Ʊ������Ʊ:"+tickets--);
			}
			
			}
		}
		
		}else{
			show();
		}
			
		
		
	}
	
	private synchronized void show() {
		if(tickets>0){
//			try{Thread.sleep(10);}�����쳣��
//			catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+
				"����Ʊ������Ʊ:"+tickets--);
		}
	}
	
}

public class testThread_runnable {

	public static void main(String[] args) {
		//����demo1����.
		Demo1 d = new Demo1();
		//�����߳�	
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		Thread t3 = new Thread(d);
		Thread t4 = new Thread(d);
		//�����߳�.
		t3.start();
		t1.start();
		t2.start();
		t4.start();
		
	}

}
