package java_Thread;
//1.一个卖票程序,多线程开启.
//同步函数所使用的对象是this.
//静态的同步方法锁是该方法所在类的字节码对象 .class
class Demo1 implements Runnable{
	
//	定义所卖总票数.
	private int tickets = 100;
	boolean flag = true;
	Object obj = new Object();
	@Override
	public void run() {
		//保证一直在运行.
		if(flag){
		while(true){
//			同步共享数据 同步锁.会消耗资源.
//			防止出现多线程安全问题：即出现0 ,-1,-2号票.
			synchronized(obj)//obj相当于一个开关默认为开,
//			只要有东西进来后就为关上其他有执行权的线程也进不来。
//			除非刚刚进来的进的出去了这个同步锁。才重新把开关打开.
			{
			//设置现实问题的限制条件.
			if(tickets>0){
//				try{Thread.sleep(10);}捕获异常。
//				catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+
					"号售票机在售票:"+tickets--);
			}
			
			}
		}
		
		}else{
			show();
		}
			
		
		
	}
	
	private synchronized void show() {
		if(tickets>0){
//			try{Thread.sleep(10);}捕获异常。
//			catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+
				"号售票机在售票:"+tickets--);
		}
	}
	
}

public class testThread_runnable {

	public static void main(String[] args) {
		//创建demo1对象.
		Demo1 d = new Demo1();
		//创建线程	
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		Thread t3 = new Thread(d);
		Thread t4 = new Thread(d);
		//开启线程.
		t3.start();
		t1.start();
		t2.start();
		t4.start();
		
	}

}
