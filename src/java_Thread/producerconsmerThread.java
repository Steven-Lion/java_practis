package java_Thread;

public class producerconsmerThread {

	public static void main(String[] args) {
		Rers r = new Rers();
		producer1 pro = new producer1(r);
		consmer1 con  = new consmer1(r) ;
		
		new Thread(pro).start();
		new Thread(pro).start();
		new Thread(con).start();
		new Thread(con).start();
		
	}

}
class Rers {
	private String name;
	private int count  ;
	private boolean flag;
	
	Rers(){
		
	}
	public synchronized void set(String name){
		while(flag){
		try{
			this.wait();
		}
		catch(Exception e){}
		}
		this.name = name+" "+count++;
		System.out.println("生产了"+name+"number:"+count);
		flag = true;
		this.notifyAll();
	}
	public synchronized void out(){
		while (!flag) {
			
			try {
			
				this.wait();
			}catch (Exception e) {
			}
			}
		
		System.out.println("消费了"+this.name+"编号:"+count);
		flag = false;
		this.notifyAll();
	}
	
}


class  producer1 implements Runnable {
	private Rers r;
	
	producer1(Rers r){
		this.r = r;
	}
	@Override
	public void run() {
	while(true){
		r.set("肥皂");
	}
	}
	
}

class consmer1 implements Runnable{
	private Rers r;
	
	consmer1(Rers r ){
		this.r = r;
	}

	@Override
	public void run() {
		while(true){
		r.out();
	}
	}
	
}


