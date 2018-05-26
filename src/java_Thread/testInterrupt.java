package java_Thread;




public class testInterrupt {
	
	public static void main(String[] args) {
		
		TestIerrupt t = new TestIerrupt();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		
		int num = 0;//�ж��̵߳�����.
		
		while(true){
			
			if(num++ == 60){
				
				
			
				t.Stopthread();
			
			    t1.interrupt();
			    t2.interrupt();
			    
				break;
			}
			
			System.out.println(Thread.currentThread().getName()+"���ˣ�"+num+"��.");
			
		}
		
		
		
	}

}

class  TestIerrupt implements Runnable{
	
	private boolean flag = true;
	
	@Override
	public synchronized void run() {
		
			while(flag){
				try {
					this.wait();
				} catch (InterruptedException e) {
					System.out.println("�����ж��쳣.");
					flag = false;
				}
				
				System.out.println(Thread.currentThread().getName()+"was stoped	");
				
			}
			System.out.println("run������ֹ.");
		
}

	public void Stopthread(){
		
		this.flag = false;
		
	}
	
}


