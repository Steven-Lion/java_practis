package java_Thread;
/*
 * 需求
 * 银行有一个金库。
 * 有两个储户分别存300$，每次存100，存3次.
 * */

class Bank{
	Object obj = new Object();
	private int sum ;//金库总额.
//	用户存入方法.
//	1第一种方式:同步函数用synchronized修饰函数.
//	2第二种方式:同步使用代码封装的方式。
//		synchronized(一个对象){要同步的代码块}
	
	public synchronized void add(int n){
		sum += n;
	
		System.out.println(Thread.currentThread().getName()+"sum = "+ sum);
	}
	
}

class demo implements Runnable{//实现Runnable接口
	
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
			
		demo e = new demo();//创建实例.
			
		//创建线程
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		
		//开启线程.
		t1.start();
		t2.start();
	}

}
