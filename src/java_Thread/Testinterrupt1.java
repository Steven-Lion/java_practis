package  java_Thread;

public class Testinterrupt1 {

	public static void main(String[] args) {
		
		stopthread1 s = new stopthread1();
		
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		
		
		int num1 = 0;
		
		System.out.println("程序开始.");
		
		while(true){
			
			System.out.println(Thread.currentThread().getName()+"---"+num1);
			
			if(num1++ == 40	){
				
				System.out.println("准备结束.");
				
				s.changeflag1();
				
				t1.interrupt();
				t2.interrupt();
				System.out.println("over");
				break;
				
			}
		
		}
		
		
		
	}

}

class stopthread1 implements Runnable{
	
	private boolean flag = true;
	@Override
	public synchronized void run() {
			
		while(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("捕获中断线程异常.");
				flag = false;
			}
			System.out.println(Thread.currentThread().getName()+"is running");
				
			}
		
		
		
		
	}
	public void changeflag1(){
		this.flag = false;
	}
}
