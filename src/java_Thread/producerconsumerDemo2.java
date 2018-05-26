package java_Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class producerconsumerDemo2 {

	public static void main(String[] args) {
		Rers1 r = new Rers1();
		
		producer2 pro = new producer2(r);
		consmer2 con  = new consmer2(r) ;
		
		new Thread(pro).start();
		new Thread(pro).start();
		new Thread(con).start();
		new Thread(con).start();
		

	}

}

class Rers1 {
	private String name;
	private int count  ;
	private boolean flag;
	
	private Lock lock = new ReentrantLock();
	
	Condition cdt_pro = lock.newCondition();
	Condition cdt_con = lock.newCondition();
	
	
	Rers1(){
		
	}
	public  void set(String name)throws InterruptedException{
		
		lock.lock();
		try{
			while(flag){
		
				cdt_pro.await();
			}
				this.name = name+" "+count++;
		      	
				System.out.println("生产了"+name+"number:"+count);
		      	
		      	flag = true;
		      	
		      	cdt_con.signal();;
		
		
		}finally{
			lock.unlock();
		}
			
		
		
		
	}
	public synchronized void out()throws InterruptedException{
		lock.lock();
		try {
		while (!flag) {
				cdt_con.await();
				}
				System.out.println("消费了"+this.name+"编号:"+count);
				flag = false;
				cdt_pro.signal();
		
		
		}finally{
				lock.unlock();
			
			}
		
	}
	
}


class  producer2 implements Runnable {
	private Rers1 r;
	
	public producer2(Rers1 r2) {
		this.r = r2;
	}
	
	@Override
	public void run() {
	while(true){
		try {
			r.set("肥皂");
		} catch (InterruptedException e) {
		}
	}
	}
	
}

class consmer2 implements Runnable{
	private Rers1 r;
	
	public consmer2(Rers1 r2) {
		this.r = r2;
	}

	@Override
	public void run() {
		while(true){
		try {
			r.out();
		} catch (InterruptedException e) {
		}
	}
	}
	
}
