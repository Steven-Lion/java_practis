package java_Thread;

class Rer{
	private String name ;
	private String sex ;
	private boolean flag;
	
	public synchronized void set(String name, String sex){
		if(flag)//false
		try{this.wait();}catch(Exception e){}
		this.name = name;
		this.sex  = sex ;
		flag = true;
		this.notify();
		
	}

	public synchronized void get(){
	
		if(!flag)//true
		{
		try{this.wait();}catch(Exception e){}//线程状态是等待状态.
		System.out.println(name+"..."+sex); 
		}
		flag = false;
		this.notify();//唤醒线程.
		
		
	}
	
	
	 
	 
	 
}

class Input1 implements Runnable{
	
	private Rer r ;
	int x = 0;
	Input1(Rer r){
		this.r = r;
	}
	@Override
	public void run() {
		
		while(true){
		
		if(x==0){
			r.set("nike","male")  ;
		}else{
			r.set("lili","famale");
			
		}
		x = (x+1)%2;
		
		
	}
	}
}

class Output1 implements Runnable{
	 Rer r;
	Output1(Rer r){
		this.r = r;
	}
	@Override
	public void run() {
		
		while(true){
			r.get();
			}
			
	}
	
}


public class multi_Threadtranslation {
	
	
	public static void main(String[] args) {
		
		Rer r = new Rer();

		new Thread(new Input1(r)).start();
		new Thread(new Output1(r)).start();
	}

}
